package edu.esprit.tag.services;

import javax.ejb.Remote;

import edu.esprit.tag.persistence.CommentsPK;

@Remote
public interface CommentsPKServiceRemote {
	void create(CommentsPK commentsPK );
	void delete (CommentsPK commentsPK);


}
