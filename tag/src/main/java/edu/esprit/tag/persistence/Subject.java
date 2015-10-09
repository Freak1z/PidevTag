package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Forum
 *
 */
@Entity
@Table(name="t_subject")

public class Subject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private Date creationDate;
	private String description;
	private Integer views;
	private Integer likes;
	private float notes;
	private Integer nbNotes;
	private List<Comments> Commentss ;

	public Subject() {
		super();
	} 
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public float getNotes() {
		return notes;
	}

	public void setNotes(float notes) {
		this.notes = notes;
	}

	public Integer getNbNotes() {
		return nbNotes;
	}

	public void setNbNotes(Integer nbNotes) {
		this.nbNotes = nbNotes;
	}	
	  
	
	@OneToMany(mappedBy="subject")
	public List<Comments> getCommentss() {
		return Commentss;
	}
	
	public void setCommentss(List<Comments> commentss) {
		Commentss = commentss;
	}
   
}
