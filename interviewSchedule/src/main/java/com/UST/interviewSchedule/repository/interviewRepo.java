package com.UST.interviewSchedule.repository;

import com.UST.interviewSchedule.model.interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface interviewRepo extends JpaRepository<interview,Integer> {

    interview findByemailId(String emailId);
}
