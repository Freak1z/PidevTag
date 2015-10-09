package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EventMember
 *
 */
@Entity
public class EventMember extends Member implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private List<Event> events;
	private Admin admin;


	public EventMember() {

	}


	@OneToMany( mappedBy = "eMember")
	public List<Event> getEvents() {
		return events;
	}


	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@ManyToOne
	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
   
}
