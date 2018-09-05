package com.capstone6.Capstone6.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private User user;
	private String name;
	private String description;
	private String duedate;
	private Boolean complete;
	
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Task(Long id, User user, String name, String description, String duedate, Boolean complete) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
	}

	public Task( User user, String name, String description, String duedate, Boolean complete) {
		this.user = user;
		this.name = name;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getDuedate() {
		return duedate;
	}



	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}



	public Boolean getComplete() {
		return complete;
	}



	public void setComplete(Boolean complete) {
		this.complete = complete;
	}



	@Override
	public String toString() {
		return "id=" + id + ", user=" + user + ", name=" + name + ", description=" + description + ", duedate="
				+ duedate + ", complete=" + complete;
	}
	
	
	
	

}
