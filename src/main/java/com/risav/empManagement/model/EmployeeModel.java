package com.risav.empManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="empdata")
public class EmployeeModel {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  public int id;

  @Column(nullable = false, unique = true)
  private String fname;
  
  @Column
  private String lname;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false, unique = true)
  private String phone;

  @Column(nullable = false, unique = true)
  private String department;

/*
  public int getId() {
	return id;
  }

  public void setId(int id) {
	this.id = id;
  }

  public String getFname() {
	return fname;
  }

  public void setFname(String fname) {
	this.fname = fname;
  }

  public String getLname() {
	return lname;
  }

  public void setLname(String lname) {
	this.lname = lname;
  }

  public EmployeeModel(int id, String fname, String lname, String email, String phone, String department) {
    this.id = id;
    this.fname = fname;
    this.lname = lname;
    this.email = email;
    this.phone = phone;
    this.department = department;
  }

  @Override
  public String toString() {
    return "EmployeeModel [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
        + ", department=" + department + "]";
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public String getPhone() {
	return phone;
  }

  public void setPhone(String phone) {
	this.phone = phone;
  }

  public String getDepartment() {
	return department;
  }

  public void setDepartment(String department) {
	this.department = department;
  }
*/
 
}
