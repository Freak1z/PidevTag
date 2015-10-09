package edu.esprit.tag.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.tag.persistence.Comments;

@Remote
public interface CommentsServiceRemote {

	void create(Comments comments );
	void delete (Comments comments);
	void update(Comments comments);
	List<Comments> findAll();
}
