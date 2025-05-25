package com.example.Employ.payroll.Controller;

import com.example.Employ.payroll.Model.Employee;
import com.example.Employ.payroll.Service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employee_Controller {
    @Autowired
    Employee_Service employeeService;
    @GetMapping("/viewAllEmployee")
    public List<Employee> viewAllEmployee()
    {
       return employeeService.viewEmployee();
    }
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee)
    {
       boolean b = employeeService.addEmployee(employee);
       if(b)
       {
           return "Successfully Added...";
       }else {
           return "Already the Id is available ";
       }

    }
    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestBody Employee employee)
    {
       return employeeService.deleteEmployee(employee);
    }
    @GetMapping("/menu")
    public String menu()
    {
        return employeeService.memu();
    }
    @GetMapping("/search")
    public String search(@RequestBody Employee employee)
    {
        return employeeService.searchEmployee(employee);
    }
    @PutMapping("/update")
    public String update( @RequestBody  Employee employee)
    {
         employeeService.updateEmployee(employee);
         return "Update successfully";
    }

}
