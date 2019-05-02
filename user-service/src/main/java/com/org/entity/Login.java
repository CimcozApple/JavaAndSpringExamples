package com.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
@Author Varun Adhikari
*/
@Entity
@Table(name="login")
public class Login {
	
	@Column(name="username")
	String username;
	
	@Id
	@Column(name="email")
	String email;
	
	@Column(name="pass")
	String pass;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", email=" + email + ", pass=" + pass + "]";
	}
	
}

