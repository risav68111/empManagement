package com.risav.empManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.risav.empManagement.dto.EmployeeDto;
import com.risav.empManagement.service.EmployeeService;

@RestController
@RequestMapping("api/v1/emp")
public class EmployeeRestController {

  @Autowired
  EmployeeService service;

  /*
   * @GetMapping("/")
   * public ResponseEntity<EmployeeDto> getList(@RequestBody EmployeeDto
   * employeeDto) {
   * return new ResponseEntity<>(service.addEmployee(employeeDto),
   * HttpStatus.CREATED);
   * }
   */

  @GetMapping("/{id}")
  public EmployeeDto fromId(@PathVariable int id) {

    return service.getById(id);

  }

  @GetMapping("/")
  public List<EmployeeDto> addEmployeeRequest() {

    return service.getAllEmployee();

  }

  @PostMapping("/new")
  public ResponseEntity<EmployeeDto> addEmployeeRequest(@RequestBody EmployeeDto employeeDto) {
    EmployeeDto saved = service.addEmployee(employeeDto);
    return new ResponseEntity<>(saved, HttpStatus.CREATED);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<EmployeeDto> updateEmployeeRequest(@RequestBody EmployeeDto newdata, @PathVariable int id) {

    EmployeeDto updatedData = service.updateEmployee(id, newdata);

    return new ResponseEntity<>(updatedData, HttpStatus.OK);

  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteEmployeeRequest(@PathVariable int id) {

    service.deleteEmployee(id);

    return  ResponseEntity.ok("USER DELETED SUCCESSFULLY");

  }

}
