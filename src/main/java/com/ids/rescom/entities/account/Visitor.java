package com.ids.rescom.entities.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitor {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private String icNo;
	private String carPlate;
	
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
	public String getIcNo() {
		return icNo;
	}
	public void setIcNo(String icNo) {
		this.icNo = icNo;
	}
	public String getCarPlate() {
		return carPlate;
	}
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
}
