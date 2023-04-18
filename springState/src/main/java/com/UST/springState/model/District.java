package com.UST.springState.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class District {
    @Id
    @GeneratedValue
    private int id;
    private String districtName;
    private State state;

}
