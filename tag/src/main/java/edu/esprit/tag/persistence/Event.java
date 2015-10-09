package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="t_event")

public class Event implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idEvent;
	private String nameEvent;
	private Date eventDate;
	private String place;
	private String description;
	private String eventType;

	private List<Sponsor> sponsors;
	private EventMember eMember;
	
	public Event() {
	}

	
	public Event(Integer idEvent, String nameEvent,
			String place, String description, String eventType) {
		super();
		this.idEvent = idEvent;
		this.nameEvent = nameEvent;
		//this.eventDate = eventDate;
		this.place = place;
		this.description = description;
		this.eventType = eventType;
	}



	@Override
	public String toString() {
		return "Event [idEvent=" + idEvent + ", nameEvent=" + nameEvent
				+ ", eventDate=" + eventDate + ", place=" + place
				+ ", description=" + description + ", eventType=" + eventType
				+ ", comments="  + ", sponsors=" + sponsors
				+ ", eMember=" + eMember + "]";
	}


	@Id    
	public Integer getIdEvent() {
		return this.idEvent;
	}

	public void setIdEvent(Integer idEvent) {
		this.idEvent = idEvent;
	}   
	public String getNameEvent() {
		return this.nameEvent;
	}

	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}   
	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}   
	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
   
	
	@ManyToOne
	public EventMember geteMember() {
		return eMember;
	}
	public void seteMember(EventMember eMember) {
		this.eMember = eMember;
	}
	
	@ManyToMany
	public List<Sponsor> getSponsors() {
		return sponsors;
	}
	public void setSponsors(List<Sponsor> sponsors) {
		this.sponsors = sponsors;
	}
	
	

   
}
