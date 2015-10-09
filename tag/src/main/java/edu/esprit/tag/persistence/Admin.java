package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity

public class Admin extends Member implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private List<Library> libraries;
	
	private List<TechnicalMember> technicalMembers ;

	private List<MediaMember> mediaMembers ;
	private List<EventMember> eventMembers;

	
	public Admin() {
		super();
	}

    @OneToMany( mappedBy = "admin")
	public List<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}

	@OneToMany( mappedBy = "admin")
	public List<TechnicalMember> getTechnicalMembers() {
		return technicalMembers;
	}

	public void setTechnicalMembers(List<TechnicalMember> technicalMembers) {
		this.technicalMembers = technicalMembers;
	}

	@OneToMany( mappedBy = "admin")
	public List<MediaMember> getMediaMembers() {
		return mediaMembers;
	}

	public void setMediaMembers(List<MediaMember> mediaMembers) {
		this.mediaMembers = mediaMembers;
	}

	@OneToMany( mappedBy = "admin")
	public List<EventMember> getEventMembers() {
		return eventMembers;
	}

	public void setEventMembers(List<EventMember> eventMembers) {
		this.eventMembers = eventMembers;
	}

	
	
	
	
	
}
