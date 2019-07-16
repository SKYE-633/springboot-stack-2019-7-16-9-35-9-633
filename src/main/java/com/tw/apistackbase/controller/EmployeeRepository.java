package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepository(){

        this.employees=new ArrayList<>();
    }
    public List<Employee> getEmployees(){

        return employees;
    }
    public void add(Employee employee){
        employees.add(employee);
    }
}
