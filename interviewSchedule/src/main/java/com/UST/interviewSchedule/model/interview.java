package com.UST.interviewSchedule.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="interview_table")
public class interview {
    @javax.persistence.Id
    @GeneratedValue

    private int id;
    private String name;
    private String emailId;
    private String phonenum;
    private String skills;
    private String experience;
    private Date date;
    private String time;
    private String link;
    private String poc;


}
