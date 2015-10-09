package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity

public class Sponsor extends Member implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private List<Event> events;
	
	public Sponsor() {

	}
	
	@ManyToMany (mappedBy ="sponsors")
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	
	

   
}
