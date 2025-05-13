package com.risav.empManagement.mapper;

import com.risav.empManagement.dto.EmployeeDto;
import com.risav.empManagement.model.EmployeeModel;

public class EmployeeMapper {

  public static EmployeeDto employeeModelToDto (EmployeeModel savedEmployee) {
    return new EmployeeDto(
      savedEmployee.getId(),
        savedEmployee.getFname(),
      savedEmployee.getLname(),
      savedEmployee.getEmail(),
      savedEmployee.getPhone(),
      savedEmployee.getDepartment()
    );
  }

  public static EmployeeModel employeeDtoToModel (EmployeeDto empr) {
    return new EmployeeModel(
      empr.getId(),
      empr.getFname(),
      empr.getLname(),
      empr.getEmail(),
      empr.getPhone(),
      empr.getDepartment()
    );
  }
}

