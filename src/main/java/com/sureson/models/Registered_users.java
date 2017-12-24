package com.sureson.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Registered_users")
public class Registered_users {
	
	private int id;
	private String u_name;
	private String email;
	private String password;
	
	public Registered_users() {
		
	}
	public Registered_users(int id, String u_name, String email, String password) {
		this.id = id;
		this.u_name = u_name;
		this.email = email;
		this.password = password;
	}
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
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
		
}
