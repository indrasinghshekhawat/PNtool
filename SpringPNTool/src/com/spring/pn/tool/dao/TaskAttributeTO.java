package com.spring.pn.tool.dao;

public class TaskAttributeTO {
	
	public long taskID;

	public long wpdID;

	public long waID;
	
	public TaskAttributeTO(){}

	public TaskAttributeTO(long taskID, long wpdID, long waID) {
		super();
		this.taskID = taskID;
		this.wpdID = wpdID;
		this.waID = waID;
	}

	public long getTaskID() {
		return taskID;
	}

	public void setTaskID(long taskID) {
		this.taskID = taskID;
	}

	public long getWpdID() {
		return wpdID;
	}

	public void setWpdID(long wpdID) {
		this.wpdID = wpdID;
	}

	public long getWaID() {
		return waID;
	}

	public void setWaID(long waID) {
		this.waID = waID;
	}

	@Override
	public String toString() {
		return "TaskAttributeTO [taskID=" + taskID + ", wpdID=" + wpdID + ", waID=" + waID + "]";
	}
	
}
