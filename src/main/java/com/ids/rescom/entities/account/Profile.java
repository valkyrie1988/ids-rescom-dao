package com.ids.rescom.entities.account;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String hpContact;
	private Byte image;
	private String deviceId;
	private Date lastLoggedIn;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHpContact() {
		return hpContact;
	}
	public void setHpContact(String hpContact) {
		this.hpContact = hpContact;
	}
	public Byte getImage() {
		return image;
	}
	public void setImage(Byte image) {
		this.image = image;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}
	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}
	

}
