package edu.tasks.task3;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Group extends Entity {
	private static final int MIN_STUDENTS = 6;
	private static final int MAX_STUDENTS = 30;
	
	private Set<Student> students = new HashSet<>();
	private String name;
	private Grade grade;
	private Mentor curator;
	
	public Group(String name, Grade grade, Mentor curator) {
		this.name = name;
		this.grade = grade;
		this.curator = curator;
	}

	public String getName() { return name;}
	public void setName(String name) { this.name = name;}

	public Grade getGrade() {return grade;}
	public void setGrade(Grade grade) { this.grade = grade;}

	public Mentor getCurator() {return curator;}
	public void setCurator(Mentor curator) { this.curator = curator;}
	
	public void addStudent(Student student) {
		if(students.size()==MAX_STUDENTS) throw new ConsistencyException(String.format("group should contain at most %d students",MAX_STUDENTS));
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		if(students.size()==MIN_STUDENTS) throw new ConsistencyException(String.format("group should contain at least %d students",MIN_STUDENTS));
		students.remove(student);
	}
	
	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(getName()).
				add(getGrade().toString()).
				add(getCurator().toString()).
				toString();
	}
}
