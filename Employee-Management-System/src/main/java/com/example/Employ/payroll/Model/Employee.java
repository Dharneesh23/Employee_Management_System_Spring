package com.example.Employ.payroll.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {
  private String name;
  private int employee_Id;
  private int experience;
  private String role;
  private long salary;
  public String toString()
  {
      return "Employee_Name : "+getName()+"\n Employee_ID :"+getEmployee_Id()+"\n Experience :"+getExperience()+"\n Employee_Role :"+getRole()+"\n Salary :"+getSalary();
  }
}
