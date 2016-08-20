package com.ids.rescom.entities.account;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Unit unit;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Profile profile;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
