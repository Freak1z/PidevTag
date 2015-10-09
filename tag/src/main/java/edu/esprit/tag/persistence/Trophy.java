package edu.esprit.tag.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Trophy
 *
 */
@Entity
@Table(name="t_trophy")

public class Trophy implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idTrophy;
	private String nameTrophy;
	private String description;

	private Member member;
	
	public Trophy() {
	}   
	@Id    
	public Integer getIdTrophy() {
		return this.idTrophy;
	}

	public void setIdTrophy(Integer idTrophy) {
		this.idTrophy = idTrophy;
	}   
	public String getNameTrophy() {
		return this.nameTrophy;
	}

	public void setNameTrophy(String nameTrophy) {
		this.nameTrophy = nameTrophy;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@ManyToOne 
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
   
}
