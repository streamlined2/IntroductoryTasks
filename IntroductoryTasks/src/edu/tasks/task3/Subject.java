package edu.tasks.task3;

import java.util.StringJoiner;

public class Subject extends Entity {
	private String title;
	private int volume;
	
	public Subject() {}
	
	public Subject(String title, int volume) {
		super();
		this.title = title;
		this.volume = volume;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(",","[","]").
				add(super.toString()).
				add(getTitle()).
				add(Integer.toString(getVolume())).
				toString();
	}
}
