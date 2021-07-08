package edu.tasks.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

public class Course extends Entity {
	private LocalDate start;
	private LocalDate finish;
	private Subject subject;
	private Mentor mentor;
	
	public Course() {}

	public Course(LocalDate start, LocalDate finish, Subject subject, Mentor mentor) {
		super();
		this.start = start;
		this.finish = finish;
		this.subject = subject;
		this.mentor = mentor;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate startDate) {
		this.start = startDate;
	}

	public LocalDate getFinish() {
		return finish;
	}

	public void setFinish(LocalDate finishDate) {
		this.finish = finishDate;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(getStart().format(DateTimeFormatter.ISO_LOCAL_DATE)).
				add(getFinish().format(DateTimeFormatter.ISO_LOCAL_DATE)).
				add(subject.toString()).
				add(mentor.toString()).
				toString();
	}

}
