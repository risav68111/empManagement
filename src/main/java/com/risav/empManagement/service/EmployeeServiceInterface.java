package com.risav.empManagement.service;

import java.util.List;

import com.risav.empManagement.model.EmployeeModel;
import com.risav.empManagement.dto.EmployeeDto;

public interface EmployeeServiceInterface {

  public List<EmployeeDto> getAllEmployee();

  public EmployeeDto addEmployee(EmployeeDto employeeDto);

  public EmployeeDto getById(int id);

  public EmployeeDto updateEmployee(int id, EmployeeDto employeeModel);

  public void deleteEmployee(int id);

}
