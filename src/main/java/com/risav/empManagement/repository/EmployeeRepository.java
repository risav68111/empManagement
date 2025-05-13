package com.risav.empManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.risav.empManagement.model.EmployeeModel;

// @Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

}
