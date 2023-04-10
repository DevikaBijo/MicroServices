package com.UST.springbootEmployee.repository;

import com.UST.springbootEmployee.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel,Integer> {

}
