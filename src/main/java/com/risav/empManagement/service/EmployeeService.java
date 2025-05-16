package com.risav.empManagement.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.risav.empManagement.dto.EmployeeDto;
import com.risav.empManagement.exception.ResourceNotFound;
import com.risav.empManagement.mapper.EmployeeMapper;
import com.risav.empManagement.model.EmployeeModel;
import com.risav.empManagement.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService implements EmployeeServiceInterface {

  @Autowired
  private EmployeeRepository repository;

  @Override
  public EmployeeDto addEmployee(EmployeeDto employeeDto) {

    EmployeeModel employeeModel = EmployeeMapper.employeeDtoToModel(employeeDto);
    EmployeeModel savedEmployee = repository.save(employeeModel);

    return EmployeeMapper.employeeModelToDto(savedEmployee);

  }

  @Override
  public List<EmployeeDto> getAllEmployee() {

    List<EmployeeModel> allemp = repository.findAll();

    List<EmployeeDto> allEmployee = allemp.stream()
        .map(EmployeeMapper::employeeModelToDto)
        .collect(Collectors.toList());
    return allEmployee;
  }

  @Override
  public EmployeeDto getById(int id) {

    String message = "User Not Found With id :" + id;

    EmployeeModel user = repository
        .findById(id).orElseThrow(() -> new ResourceNotFound(message));

    return EmployeeMapper.employeeModelToDto(user);
  }

  @Override
  public EmployeeDto updateEmployee(int id, EmployeeDto updatedDate) {

    String str = "User Not Found With id :" + id;

    EmployeeModel employee = repository
        .findById(id).orElseThrow(() -> new ResourceNotFound(str));

    employee.setFname(updatedDate.getFname());
    employee.setLname(updatedDate.getLname());
    employee.setEmail(updatedDate.getEmail());
    employee.setPhone(updatedDate.getPhone());
    employee.setDepartment(updatedDate.getDepartment());

    repository.save(employee);

    return EmployeeMapper.employeeModelToDto(employee);
  }

  @Override
  public void  deleteEmployee(int id) {
    EmployeeModel user = repository
        .findById(id).orElseThrow(() -> new ResourceNotFound("User Not Found: " + id));

    repository.deleteById(id);

  }

}
