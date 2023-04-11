package com.UST.interviewSchedule.service;


import com.UST.interviewSchedule.model.interview;
import com.UST.interviewSchedule.repository.interviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class interviewService {
@Autowired
private interviewRepo repo;

   public interview createinterview(interview interviewmodel) {
    return repo.save(interviewmodel);
    }
    public List<interview> getAllinterview() {
     return repo.findAll();
    }

 public interview getinterviewByemailId(String emailId) {
    return repo.findByemailId(emailId);
 }
}
