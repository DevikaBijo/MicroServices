package com.UST.interviewSchedule.controller;

import com.UST.interviewSchedule.model.interview;
import com.UST.interviewSchedule.service.interviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class interviewController {
    @Autowired
    private interviewService service;
    @PostMapping("/")
    public interview addinterview(@RequestBody interview interviewmodel){
        return service.createinterview(interviewmodel);
    }
    @GetMapping("/all")
    public List<interview> getAllinterview(){
        return service.getAllinterview();
    }
    @GetMapping("/all/{emailId}")
    public  interview getinterviewById(@PathVariable String emailId){

        return service.getinterviewByemailId(emailId);
    }

}
