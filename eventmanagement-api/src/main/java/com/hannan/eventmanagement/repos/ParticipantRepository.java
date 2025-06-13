package com.hannan.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hannan.eventmanagement.entities.Participant;

@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
