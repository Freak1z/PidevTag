package edu.esprit.tag.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.tag.persistence.EventMember;

@Stateless
public class EventMemberService implements EventServiceMemberRemote {

	@PersistenceContext
	private EntityManager em;

	public EventMemberService() {
	}

	public void create(EventMember eMember) {
		em.persist(eMember)	;	
	}

	
	public void delete(EventMember eMember) {
		em.remove(em.merge(eMember));
	}

	
	public void update(EventMember eMember) {
		em.merge(eMember);
		
	}

	
}
