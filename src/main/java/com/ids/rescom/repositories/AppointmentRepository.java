package com.ids.rescom.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.rescom.entities.appointment.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long>{
	public Appointment findById(Long id);
	public Appointment findByIdAndStatus(Long id, int status);
	public List<Appointment> findByCreatedByAndStatusOrderByVisitDtDesc(Long id, int status);
}
