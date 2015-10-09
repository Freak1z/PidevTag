package edu.esprit.tag.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.tag.persistence.Comments;

/**
 * Session Bean implementation class CommentsService
 */
@Stateless
@LocalBean
public class CommentsService implements CommentsServiceRemote {

	@PersistenceContext
	private EntityManager em;
	
    public CommentsService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Comments comments) {
		em.persist(comments);		
	}

	@Override
	public void delete(Comments comments) {
		em.remove(em.merge(comments));		
		
	}

	@Override
	public void update(Comments comments) {
		em.merge(comments);
		
	}

	@Override
	public List<Comments> findAll() {
		
		return em.createQuery("select c from Comments c", Comments.class)
				.getResultList();
	}

}
