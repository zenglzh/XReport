/*
 * @(#)RangeCommand.java  2012-8-1	
 *
 * Copyright  2010 Join-Cheer Corporation Copyright (c) All rights reserved.
 * BEIJING JOIN-CHEER SOFTWARE CO.,LTD
 */

package com.jiuqi.report.transform;

import com.jiuqi.report.Cell;
import com.jiuqi.xlib.ICommand;
import com.jiuqi.xlib.command.CompoundCommand;

/**
 * <p>Title:区域命令</p>
 * <p>Description:</p>
 * @author:  zenglizhi
 * @time:    2012-8-1
 * @version:  v1.0
 * @see:
 * @since:    SR5.0.1
 */
public abstract class RangeCommand implements ICommand{
	
	/**
	 * 操作位置
	 */
	private Cell _position;
	
	/**
	 * 操作数
	 */
	private int _count;

	/**
	 * 操作方向
	 */
	private int _direction;
	
	
	
	public RangeCommand(Cell position,int count,int direction){
		_position = position;
		_count = count;
		_direction = direction;
	}
	
	public ICommand chain(ICommand command) {
		if (command == null)
			return this;
		class ChainedCompoundCommand extends CompoundCommand{
			public ICommand chain(ICommand c) {
				add(c);
				return this;
			}
		}
		CompoundCommand result = new ChainedCompoundCommand();
		result.add(this);
		result.add(command);
		return result;
	}

	public abstract void execute();

	public void redo() {
		execute();
	}

	public void undo() {
	}

	public void dispose() {
	}
	
	public boolean canExecute() {
		return true;
	}
	
	public boolean canUndo() {
		return false;
	}

	
	public Cell getPosition() {
		return _position;
	}

	public void setPosition(Cell position) {
		this._position = position;
	}

	public int getCount() {
		return _count;
	}

	public void setCount(int count) {
		this._count = count;
	}

	public int getDirection() {
		return _direction;
	}

	public void setDirection(int direction) {
		this._direction = direction;
	}
	
	
	
}
