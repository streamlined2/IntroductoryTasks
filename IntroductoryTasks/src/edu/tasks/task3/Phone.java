package edu.tasks.task3;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class Phone implements Serializable {
	private String value;

	public Phone(String value) {
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
	
	@Override
	public int hashCode() {
		return Objects.hashCode(value);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Phone) {
			return Objects.equals(value, ((Phone)obj).value);  
		}
		return false;
	}

}
