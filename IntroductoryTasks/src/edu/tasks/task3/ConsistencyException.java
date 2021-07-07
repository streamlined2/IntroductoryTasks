package edu.tasks.task3;

public class ConsistencyException extends RuntimeException {
	
	public ConsistencyException(String msg) {
		super(msg);
	}
	
	public ConsistencyException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
