package com.example.Employ.payroll.Service;

import com.example.Employ.payroll.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Employee_Service {
    ArrayList<Employee>list = new ArrayList<>(
            Arrays.asList(new Employee("Dharneesh",17,0,"Java Developer",450000))
    );
    public List<Employee> viewEmployee() {
        return list;
    }

    public boolean addEmployee(Employee employee) {
        for(Employee e : list)
        {
            if(e.getEmployee_Id()==employee.getEmployee_Id())
            {
                System.out.println("Already ID is available..");
                return false;
            }
        }
        list.add(employee);
        return true;
    }

    public String deleteEmployee( Employee employeeId) {
        int index = 0;
        boolean find = false;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getEmployee_Id()==employeeId.getEmployee_Id())
            {
                index = i;
                find = true;
                break;
            }
        }
        if(find)
        {
            list.remove(index);
            return "Successfully Removed";
        }else {
            return "Employee Not found";
        }
    }

    public String memu() {
        return "********Dashboard******** \n Add_Employee\n View_All_Employee\n Update\n Specific_Search_Employee\n Delete";
    }


    public String searchEmployee(Employee employee) {
        for (Employee e : list) {
            if (e.getEmployee_Id() == employee.getEmployee_Id()) {
                return e.toString();
            }
        }
        return "Employee not found!";
    }

    public void updateEmployee(Employee employee) {
         int index =0;
         boolean find = false;
         for(int i=0;i<list.size();i++)
         {
             if(list.get(i).getEmployee_Id()==employee.getEmployee_Id()) {
                 index = i;
                 find = true;
                 break;
             }
         }
         list.set(index,employee);

    }
}
