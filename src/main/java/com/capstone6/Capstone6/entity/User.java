package com.capstone6.Capstone6.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	private String email;
	private String password;
	private String name;
	@Transient
	Set<Task> task;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Long id, String email, String password, String name, Set<Task> task) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.task = task;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Task> getTask() {
		return task;
	}


	public void setTask(Set<Task> task) {
		this.task = task;
	}


	@Override
	public String toString() {
		return "id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", task=" + task;
	}
	
	

}
