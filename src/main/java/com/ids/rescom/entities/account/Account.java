package com.ids.rescom.entities.account;

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
	
	@OneToOne
	private Unit unit;
	
	@OneToOne
	private Profile profile;
	
	
}
