package com.hannan.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hannan.eventmanagement.entities.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

}
