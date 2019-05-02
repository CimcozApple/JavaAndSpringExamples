package com.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
@Author Varun Adhikari
*/
@Entity
@Table(name="location")
public class Location {

	@Id
	@Column(name="locationId")
	String locationId;
	
	@Column(name="username")
	String username;
	
	@Column(name="longitude")
	Long longitude;
	
	@Column(name="latitude")
	Long latitude;

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", username=" + username + ", longitude=" + longitude
				+ ", latitude=" + latitude + "]";
	}
}

