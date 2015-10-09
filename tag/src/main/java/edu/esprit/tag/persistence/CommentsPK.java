package edu.esprit.tag.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class CommentsPK implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private int idMember;
	private int idSubject;
	
	public CommentsPK() {
		// TODO Auto-generated constructor stub
	}
	@Column(name="idMember")
	public int getIdMember() {
		return idMember;
	}
	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}
	@Column(name="idSubject")
	public int getIdSubject() {
		return idSubject;
	}
	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMember;
		result = prime * result + idSubject;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommentsPK other = (CommentsPK) obj;
		if (idMember != other.idMember)
			return false;
		if (idSubject != other.idSubject)
			return false;
		return true;
	}
	

}
