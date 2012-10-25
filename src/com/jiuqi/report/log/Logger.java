
package com.jiuqi.report.log;

import java.security.AccessControlException;

/**
 * Abstract wrapper class for the logging interface of choice.  
 * The methods declared here are the same as those for the log4j  
 */
public abstract class Logger
{
  /**
   * The singleton logger
   */
  private static Logger logger = null;

  /**
   * Factory method to return the logger
   */
  public static final Logger getLogger(Class<?> cl)
  {
    if (logger == null)
    {
      initializeLogger();
    }

    return logger.getLoggerImpl(cl);
  }

  /**
   * Initializes the logger in a thread safe manner
   */
  private synchronized static void initializeLogger()
  {
    if (logger != null)
    {
      return;
    }

    String loggerName = LoggerName.NAME;

    try
    {
      // First see if there was anything defined at run time
      loggerName = System.getProperty("logger");

      if (loggerName == null)
      {
        // Get the logger name from the compiled in logger 
        loggerName = LoggerName.NAME;
      }

      logger = (Logger) Class.forName(loggerName).newInstance();
    }
    catch(IllegalAccessException e)
    {
      logger = new SimpleLogger();
      logger.warn("Could not instantiate logger " + loggerName + 
                  " using default");
    }
    catch(InstantiationException e)
    {
      logger = new SimpleLogger();
      logger.warn("Could not instantiate logger " + loggerName + 
                  " using default");
    }
    catch (AccessControlException e)
    {
      logger = new SimpleLogger();
      logger.warn("Could not instantiate logger " + loggerName + 
                  " using default");
    }
    catch(ClassNotFoundException e)
    {
      logger = new SimpleLogger();
      logger.warn("Could not instantiate logger " + loggerName + 
                  " using default");
    }
  }

  /**
   * Constructor
   */
  protected Logger()
  {
  }

  /**
   *  Log a debug message
   */
  public abstract void debug(Object message);

  /**
   * Log a debug message and exception
   */
  public abstract void debug(Object message, Throwable t);

  /**
   *  Log an error message
   */
  public abstract void error(Object message);

  /**
   * Log an error message object and exception
   */
  public abstract void error(Object message, Throwable t);

  /**
   * Log a fatal message
   */
  public abstract void fatal(Object message);

  /**
   * Log a fatal message and exception
   */
  public abstract void fatal(Object message, Throwable t);

  /**
   * Log an information message
   */
  public abstract void info(Object message);

  /**
   * Logs an information message and an exception
   */
  public abstract void info(Object message, Throwable t);

  /**
   * Log a warning message object
   */
  public abstract void warn(Object message);

  /**
   * Log a warning message with exception
   */
  public abstract void warn(Object message, Throwable t);

  /**
   * Accessor to the logger implementation
   */
  protected abstract Logger getLoggerImpl(Class<?> cl);

  /**
   * Empty implementation of the suppressWarnings.  Subclasses may 
   * or may not override this method.  This method is included
   * primarily for backwards support of the jxl.nowarnings property, and
   * is used only by the SimpleLogger
   *
   * @param w suppression flag
   */
  public void setSuppressWarnings(boolean w)
  {
    // default implementation does nothing
  }
}
