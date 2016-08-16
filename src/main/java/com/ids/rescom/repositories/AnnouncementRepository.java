package com.ids.rescom.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.rescom.entities.announcement.Announcement;

@Repository
public interface AnnouncementRepository extends CrudRepository<Announcement, Long> {
	public List<Announcement> findAllByOrderBySequence();
}
