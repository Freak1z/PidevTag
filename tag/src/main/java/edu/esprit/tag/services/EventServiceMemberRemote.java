package edu.esprit.tag.services;

import javax.ejb.Remote;

import edu.esprit.tag.persistence.EventMember;


@Remote
public interface EventServiceMemberRemote{


	void create(EventMember eMember) ;
	void delete(EventMember eMember);
	void update(EventMember eMember);
	//List<> findAll();

}
