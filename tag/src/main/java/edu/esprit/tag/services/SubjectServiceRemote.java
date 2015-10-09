package edu.esprit.tag.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.tag.persistence.Subject;

@Remote
public interface SubjectServiceRemote {
	
	void create(Subject subject );
	void delete (Subject subject);
	void update(Subject subject);
	List<Subject> findAll();
	List<Subject> findByPlace(String title);

}
