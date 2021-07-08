package edu.tasks.task3;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Student extends Person {	
	private String cardId;
	private Grade grade;
	
	public Student() {}

	public Student(String cardId, Grade grade, String passport, String firstName, String lastName, LocalDate birthDate, Country countryOfOrigin) {
		super(passport, firstName, lastName, birthDate, countryOfOrigin);
		this.cardId = cardId;
		this.grade = grade;
	}

	public String getCardId() { return cardId;}
	public void setCardId(String cardId) { this.cardId = cardId;}

	public Grade getGrade() { return grade;}
	public void setGrade(Grade grade) { this.grade = grade;	}

	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(getCardId()).
				add(getGrade().toString()).
				toString();
	}
}
