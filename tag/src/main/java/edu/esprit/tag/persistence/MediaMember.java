package edu.esprit.tag.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class MediaMember extends Member implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private List<News> news;
	
	private Admin admin;

	
	public MediaMember() {
		super();
	}

	@OneToMany( mappedBy = "mMember")
	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	@ManyToOne
	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
   
}
