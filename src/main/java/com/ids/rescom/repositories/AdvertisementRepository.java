package com.ids.rescom.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.rescom.entities.advertisements.Advertisement;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Long>{
	
	public List<Advertisement> findAllByOrderBySequence();
	public Advertisement findOneById(Long id);
}