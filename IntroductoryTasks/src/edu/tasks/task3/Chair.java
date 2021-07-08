package edu.tasks.task3;

import java.util.HashSet;
import java.util.Set;

public class Chair extends Entity {
	private static final int MIN_GROUPS = 1;
	private static final int MIN_MENTORS = 3;
	
	private Set<Group> groups = new HashSet<>();
	private Set<Mentor> mentors = new HashSet<>();
	
	public Chair() {}
	
	public void addMentor(Mentor mentor) { 
		mentors.add(mentor);
	}
	
	public void removeMentor(Mentor mentor) { 
		if(groups.size()<=MIN_MENTORS) throw new ConsistencyException(String.format("chair should contain at least %d mentors",MIN_MENTORS));
		mentors.remove(mentor);
	}
	
	public void addGroup(Group group) { 
		groups.add(group);
	}
	
	public void removeGroup(Group group) { 
		if(groups.size()<=MIN_GROUPS) throw new ConsistencyException(String.format("chair should contain at least %d groups",MIN_GROUPS));
		groups.remove(group);
	}

}
