package com.UST.springbootEmployee.controller;

import com.UST.springbootEmployee.model.EmployeeModel;
import com.UST.springbootEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeservice;
    @PostMapping("/")
    public EmployeeModel addEmployeeModel(@RequestBody EmployeeModel employeemodel) {
        return employeeservice.createEmployeeModel(employeemodel);
    }
    @GetMapping("/emps")
    public List<EmployeeModel> getAllEmployeeModel(){
        return employeeservice.getemployeemodel();

    }
    @GetMapping("/emps/{id}")
    public  EmployeeModel getEmployeeModelById(@PathVariable int id){
        return employeeservice.getEmployeeModelBy(id);
    }
    @DeleteMapping("/del/{id}")
    public String deleteEmployeeById(@PathVariable int id){
         employeeservice.deleteEmployeeById(id);
         return "element deleted";
    }


}


