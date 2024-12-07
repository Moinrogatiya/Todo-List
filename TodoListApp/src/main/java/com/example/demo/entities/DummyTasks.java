package com.example.demo.entities;

public class DummyTasks {

	String taskName;
	String taskDescription;
	boolean status;
	
	public DummyTasks() {
		super();
	}

	public DummyTasks(String taskName, String taskDescription, boolean status) {
		super();
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.status = status;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
