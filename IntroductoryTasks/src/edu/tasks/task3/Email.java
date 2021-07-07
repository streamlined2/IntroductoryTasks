package edu.tasks.task3;

import java.util.StringJoiner;

public class Email {
	private String value;

	public Email(String email) {
		this.value = email;
	}

	public String getEmail() {
		return value;
	}

	public void setEmail(String email) {
		this.value = email;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(getEmail()).
				toString();
	}

}
