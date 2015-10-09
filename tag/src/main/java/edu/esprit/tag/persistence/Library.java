package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Library
 *
 */
@Entity
@Table(name="t_library")

public class Library implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idGame;
	private String nameGame;
	
	private Admin admin;

	
	public Library() {
		super();
	}   
	@Id    
	public Integer getIdGame() {
		return this.idGame;
	}

	public void setIdGame(Integer idGame) {
		this.idGame = idGame;
	}   
	public String getNameGame() {
		return this.nameGame;
	}

	public void setNameGame(String nameGame) {
		this.nameGame = nameGame;
	}
	
	@ManyToOne
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
   
}
