package com.ids.rescom.entities.advertisements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advertisement {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int sequence;
	private String name;
	private String description;
	private String href;
	private String resourceURL;
	private int type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
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
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getResourceURL() {
		return resourceURL;
	}
	public void setResourceURL(String resourceURL) {
		this.resourceURL = resourceURL;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Advertisement [id=" + id + ", sequence=" + sequence + ", name=" + name + ", description=" + description
				+ ", href=" + href + ", resourceURL=" + resourceURL + ", type=" + type + "]";
	}
	
	
}
