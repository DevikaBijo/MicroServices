package com.UST.springbootEmployee.service;

import com.UST.springbootEmployee.model.EmployeeModel;
import com.UST.springbootEmployee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;


    public EmployeeModel createEmployeeModel(EmployeeModel employeemodel) {
        return repo.save(employeemodel);
    }

    public List<EmployeeModel> getemployeemodel() {
        return repo.findAll();
    }

    public EmployeeModel getEmployeeModelBy(int Id) {
        return repo.findById(Id).orElse(null);
    }


    public EmployeeModel deleteEmployeeById(int Id) {
         repo.deleteById(Id);
         return  null;
    }
}
