package com.ids.rescom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.rescom.entities.appointment.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long>{
	 
}
