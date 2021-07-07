package edu.tasks.task3;

import java.io.Serializable;
import java.util.Objects;

public abstract class Entity implements Serializable {
	private long id;

	public long getId() { return id;}
	public void setId(long id) { this.id = id;}

	@Override
	public int hashCode() { return Objects.hash(id);}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Entity) {
			return Objects.equals(id, ((Entity)o).id);
		}else return false;
	}
	
	@Override
	public String toString() {
		return Long.toString(id);
	}
	
}
