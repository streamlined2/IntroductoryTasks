package edu.tasks.task3;

import java.util.StringJoiner;

public class Phone {
	private String value;

	public Phone(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(getValue()).
				toString();
	}

}
