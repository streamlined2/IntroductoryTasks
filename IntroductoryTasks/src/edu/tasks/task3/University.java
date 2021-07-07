package edu.tasks.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class University extends Entity {
	private String name;
	private LocalDate founded;
	private Location location;
	private Set<Faculty> faculties = new HashSet<>();
	private Set<Subject> subjects = new HashSet<>();
	
	public University(String name, LocalDate founded, Location location) {
		this.name = name;
		this.founded = founded;
		this.location = location;
	}
	
	public String getName() { return name;}
	public void setName(String name) { this.name = name;}

	public LocalDate getFounded() { return founded;}
	public void setFounded(LocalDate founded) { this.founded = founded;}
	
	public Location getLocation() { return location;}
	public void setLocation(Location location) { this.location = location;}
	
	public void addFaculty(Faculty faculty) { faculties.add(faculty);}
	public void removeFaculty(Faculty faculty) { faculties.remove(faculty);}
	
	public void addSubject(Subject subject) { subjects.add(subject);}
	public void removeSubject(Subject subject) { subjects.remove(subject);}
	
	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(getName()).
				add(getFounded().format(DateTimeFormatter.ISO_LOCAL_DATE)).
				add(getLocation().toString()).
				toString();
	}
}
