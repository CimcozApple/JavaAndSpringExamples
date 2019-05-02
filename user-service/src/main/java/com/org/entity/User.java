package com.org.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
@Author Varun Adhikari
*/
@Entity
@Table(name="users")
public class User {
	
	@Column(name="name")
	String name;
	
	@Column(name="email")
	String email;
	
	@Id
	@Column(name="username")
	String username;
	
	@Column(name="mobile")
	String mobile;
	
	@OneToOne(cascade = CascadeType.ALL)
	Location location;
	
	@Column(name="description")
	String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", username=" + username + ", mobile=" + mobile
				+ ", location=" + location + ", description=" + description + "]";
	}
	
}

