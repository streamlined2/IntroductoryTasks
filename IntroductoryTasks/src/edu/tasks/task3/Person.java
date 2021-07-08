package edu.tasks.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

public class Person extends Entity {
	private String passport;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Country countryOfOrigin;
	
	public Person() {}

	public Person(String passport, String firstName, String lastName, LocalDate birthDate, Country countryOfOrigin) {
		this.passport = passport;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Country getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(Country countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(getPassport()).
				add(getFirstName()).
				add(getLastName()).
				add(getBirthDate().format(DateTimeFormatter.ISO_LOCAL_DATE)).
				add(getCountryOfOrigin().toString()).
				toString();
	}
}
