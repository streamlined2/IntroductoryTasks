package edu.tasks.task3;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class Email implements Serializable {
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
	
	@Override
	public int hashCode() {
		return Objects.hashCode(value);
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Email) {
			return Objects.equals(value, ((Email)obj).value);  
		}else return false;
	}

}
