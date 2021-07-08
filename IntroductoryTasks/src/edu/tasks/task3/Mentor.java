package edu.tasks.task3;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Mentor extends Person {
	private int experience;
	private int rate;
	private Set<Subject> subjects = new HashSet<>();
	
	public Mentor() {}
	
	public Mentor(String passport, String firstName, String lastName, LocalDate birthDate, Country countryOfOrigin,
			int experience, int rate) {
		super(passport, firstName, lastName, birthDate, countryOfOrigin);
		this.experience = experience;
		this.rate = rate;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
	public void removeSubject(Subject subject) {
		subjects.remove(subject);
	}

	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(Integer.toString(getExperience())).
				add(Integer.toString(getRate())).
				toString();
	}
}
