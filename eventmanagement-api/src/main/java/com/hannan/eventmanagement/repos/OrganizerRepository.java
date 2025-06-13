package com.hannan.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hannan.eventmanagement.entities.Organizer;

@Repository
public interface OrganizerRepository extends CrudRepository<Organizer, Long> {

}
