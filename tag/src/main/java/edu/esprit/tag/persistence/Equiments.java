package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Equipments
 *
 */
@Entity(name="Equipments")
@Table(name="t_equiments")

public class Equiments implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idEquipment;
	private String nameEquipment;
	private String description;
	private Double price;
	private Date startUsingDate;
	
	private TechnicalMember tMember;
	

	public Equiments() {
		super();
	}   
	@Id    
	public Integer getIdEquipment() {
		return this.idEquipment;
	}

	public void setIdEquipment(Integer idEquipment) {
		this.idEquipment = idEquipment;
	}   
	public String getNameEquipment() {
		return this.nameEquipment;
	}

	public void setNameEquipment(String nameEquipment) {
		this.nameEquipment = nameEquipment;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}   
	public Date getStartUsingDate() {
		return this.startUsingDate;
	}

	public void setStartUsingDate(Date startUsingDate) {
		this.startUsingDate = startUsingDate;
	}
	
	@ManyToOne
	public TechnicalMember gettMember() {
		return tMember;
	}
	public void settMember(TechnicalMember tMember) {
		this.tMember = tMember;
	}
	
	
   
}
