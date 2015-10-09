package edu.esprit.tag.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.tag.persistence.CommentsPK;

/**
 * Session Bean implementation class CommentsPKService
 */
@Stateless
@LocalBean
public class CommentsPKService implements CommentsPKServiceRemote {

	@PersistenceContext
	private EntityManager em;
	
    public CommentsPKService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(CommentsPK commentsPK) {
		em.persist(commentsPK);		
	}

	@Override
	public void delete(CommentsPK commentsPK) {
		em.remove(em.merge(commentsPK));		
	}

}
