package com.ids.rescom.entities.facilities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	private Facility facility;
	
	private int TimeSlot;
}
