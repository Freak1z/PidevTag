package edu.esprit.tag.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.tag.persistence.Subject;

/**
 * Session Bean implementation class SubjectService
 */
@Stateless
@LocalBean
public class SubjectService implements SubjectServiceRemote {

    
	@PersistenceContext
	private EntityManager em;
	
	
    public SubjectService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Subject subject) {
		em.persist(subject);		
	}

	@Override
	public void delete(Subject subject) {
		em.remove(em.merge(subject));		
	}

	@Override
	public void update(Subject subject) {
		em.merge(subject);
		
	}

	@Override
	public List<Subject> findAll() {
		return em.createQuery("select s from Subject s", Subject.class)
				.getResultList();
	}

	@Override
	public List<Subject> findByPlace(String title) {
		return em.createQuery("select s from Subject s where s.title=:x",
				Subject.class)
				.setParameter("x", title)
				.getResultList();
	}

}
