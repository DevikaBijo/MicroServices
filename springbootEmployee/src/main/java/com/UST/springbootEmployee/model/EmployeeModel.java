package com.UST.springbootEmployee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_table")
public class EmployeeModel {
    @Id
    @GeneratedValue
    private int Id;
    private String empId;
    private String empName;
    private String empEmail;
    private String empDesignation;
    private String empHR;

}
