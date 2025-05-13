package com.risav.empManagement.repository;

import java.util.ArrayList;
import java.util.List;

import com.risav.empManagement.model.EmployeeModel;

// @Repository
public class EmployeeRepositoryFake  implements EmployeeRepositoryInterface {

  List<EmployeeModel> lst= new ArrayList<>();
  public EmployeeRepositoryFake() {

    lst.add(new EmployeeModel(1, "fname", "lname", "email","phone",  "department"));
    lst.add(new EmployeeModel(2, "fname", "lname", "email","phone",  "department"));
    lst.add(new EmployeeModel(3, "fname", "lname", "email","phone",  "department"));
    lst.add(new EmployeeModel(4, "fname", "lname", "email","phone",  "department"));
  }

	@Override
	public List<EmployeeModel> getAll() {
    return lst;
	}

  
}
