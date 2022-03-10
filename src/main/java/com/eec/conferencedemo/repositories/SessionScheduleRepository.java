package com.eec.conferencedemo.repositories;

import com.eec.conferencedemo.models.SessionSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionScheduleRepository extends JpaRepository<SessionSchedule,Long> {
}
