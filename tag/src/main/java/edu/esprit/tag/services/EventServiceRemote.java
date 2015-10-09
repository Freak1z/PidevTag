package edu.esprit.tag.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.tag.persistence.Event;


@Remote
public interface EventServiceRemote {
	
	void create(Event event );
	void delete (Event event);
	void update(Event event);
	List<Event> findAll();
	List<Event> findByPlace(String place);
	List<Event>findByType( String eventType);




}
