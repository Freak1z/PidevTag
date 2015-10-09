package edu.esprit.tag.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.tag.persistence.Event;

@Stateless
public class EventService implements EventServiceRemote {

	@PersistenceContext
	private EntityManager em;

	public EventService() {
	}

	public void create(Event event) {

		em.persist(event);
	}

	public void delete(Event event) {

		em.remove(em.merge(event));
	}

	public void update(Event event) {

		em.merge(event);
	}

	public List<Event> findAll() {

		return em.createQuery("select e from Event e", Event.class)
				.getResultList();

	}

	public List<Event> findByPlace(String place) {
		return em.createQuery("select e from Event e where e.place=:x",
				Event.class)
				.setParameter("x", place)
				.getResultList();
		
	}

	public List<Event> findByType(String eventType) {
		
		return em.createQuery("select e from Event e where e.eventType=:x",
				Event.class)
				.setParameter("x", eventType)
				.getResultList();	
	}

	




}
