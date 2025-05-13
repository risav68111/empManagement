package com.risav.empManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
  private int id;
  private String fname;
  private String lname;
  private String email;
  private String phone;
  private String department;
}


