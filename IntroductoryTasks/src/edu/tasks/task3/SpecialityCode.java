package edu.tasks.task3;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class SpecialityCode implements Serializable {
	private String value;
	
	public SpecialityCode(String value) {
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
				add(super.toString()).
				add(value).
				toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(value);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SpecialityCode) {
			return Objects.equals(value, ((SpecialityCode)obj).value);  
		}
		return false;
	}
}
