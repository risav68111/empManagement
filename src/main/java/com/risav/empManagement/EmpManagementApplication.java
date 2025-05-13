package com.risav.empManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.risav")
public class EmpManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(EmpManagementApplication.class, args);
  }

}
