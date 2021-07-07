package edu.tasks.task3;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Faculty extends Entity {
	private static final int MIN_CHAIRS = 1;
	
	private Set<Chair> chairs = new HashSet<>();
	private String name;
	private Location location;
	private Set<Phone> phones = new HashSet<>();
	private Email email;
	
	public Faculty(String name, Location location, Email email) {
		this.name = name;
		this.location = location;
		this.email = email;
	}

	public String getName() { return name;}
	public void setName(String name) { this.name = name;}

	public Location getLocation() { return location;}
	public void setLocation(Location location) { this.location = location;}

	public Email getEmail() { return email;}
	public void setEmail(Email email) { this.email = email;}
	
	public void addChair(Chair chair) { chairs.add(chair);}
	public void removeChair(Chair chair) {
		if(chairs.size()==MIN_CHAIRS) throw new ConsistencyException(String.format("faculty should contain at least %d chair",MIN_CHAIRS));
		chairs.remove(chair);
	}
	
	public void addPhone(Phone phone) { phones.add(phone);}
	public void removePhone(Phone phone) { phones.remove(phone);}
	
	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(getName()).
				add(getLocation().toString()).
				add(getEmail().toString()).
				toString();
	}
	
}
