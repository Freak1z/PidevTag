package edu.esprit.tag.persistence;

import edu.esprit.tag.persistence.CommentsPK;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comments
 *
 */
@Entity
@Table(name = "t_comment")
public class Comments implements Serializable {

	
	private String description;
	private Date creationDate;
	private CommentsPK commentspk;
	private Member member ;
	private Subject subject ;
	
	private static final long serialVersionUID = 1L;

	public Comments() {
		super();
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}   
	@EmbeddedId
	public CommentsPK getCommentspk() {
		return this.commentspk;
	}

	public void setCommentspk(CommentsPK commentspk) {
		this.commentspk = commentspk;
	}
	@ManyToOne
	@JoinColumn(name="idMember",referencedColumnName="idMember",insertable=false,updatable=false)
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@ManyToOne
	@JoinColumn(name="idSubject",referencedColumnName="id",insertable=false,updatable=false)
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
   
}
