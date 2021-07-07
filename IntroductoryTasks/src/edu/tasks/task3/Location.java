package edu.tasks.task3;

import java.util.StringJoiner;

public class Location extends Entity {
	private Country country;
	private String city;
	private String street;
	private int residence;

	public Location(Country country, String city, String street, int residence) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.residence = residence;
	}

	public Country getCountry() { return country;}
	public void setCountry(Country country) { this.country = country;}

	public String getCity() { return city;}
	public void setCity(String city) { this.city = city;}

	public String getStreet() { return street;}
	public void setStreet(String street) { this.street = street;}

	public int getResidence() { return residence;}
	public void setResidence(int residence) { this.residence = residence;}

	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(getCountry().toString()).
				add(getCity()).
				add(getStreet()).
				add(Integer.toString(residence)).
				toString();
	}
	
}
