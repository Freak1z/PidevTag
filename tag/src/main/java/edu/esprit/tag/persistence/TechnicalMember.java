package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity


public class TechnicalMember extends Member implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private List<Equiments> equiments;

	private Admin admin;
	

	public TechnicalMember() {
		super();
	}

	@OneToMany( mappedBy = "tMember")
	public List<Equiments> getEquiments() {
		return equiments;
	}




	public void setEquiments(List<Equiments> equiments) {
		this.equiments = equiments;
	}

	@ManyToOne
	public Admin getAdmin() {
		return admin;
	}



	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
   
}
