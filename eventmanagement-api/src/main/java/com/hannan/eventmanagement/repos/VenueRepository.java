package com.hannan.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hannan.eventmanagement.entities.Venue;

@Repository
public interface VenueRepository extends CrudRepository<Venue, Long> {

}
