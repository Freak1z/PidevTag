package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: News
 *
 */
@Entity
@Table(name="t_news")

public class News implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idNews;
	private String title;
	private String description;
	private Date insertDate;
	
	
	private MediaMember mMember;
	

	public News() {
		super();
	}   
	@Id    
	public Integer getIdNews() {
		return this.idNews;
	}

	public void setIdNews(Integer idNews) {
		this.idNews = idNews;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Date getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	
	
	@ManyToOne
	public MediaMember getmMember() {
		return mMember;
	}
	public void setmMember(MediaMember mMember) {
		this.mMember = mMember;
	}
	
	
	
	
   
}
