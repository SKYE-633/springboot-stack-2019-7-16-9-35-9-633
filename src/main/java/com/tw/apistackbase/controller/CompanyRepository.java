package com.tw.apistackbase.controller;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyRepository {
    private List<Company> companyList;

    public CompanyRepository(){
        this.companyList = new ArrayList<>();
        companyList.add(new Company(1001,"oocl",30,new EmployeeRepository().getEmployees()));
        companyList.add(new Company(0,"a",10,new EmployeeRepository().getEmployees()));
        companyList.add(new Company(1,"b",20,new EmployeeRepository().getEmployees()));
        companyList.add(new Company(2,"c",30,new EmployeeRepository().getEmployees()));
        companyList.add(new Company(3,"d",40,new EmployeeRepository().getEmployees()));
        companyList.add(new Company(4,"e",50,new EmployeeRepository().getEmployees()));
        companyList.add(new Company(5,"f",60,new EmployeeRepository().getEmployees()));
    }
    public List<Company> getCompanies(){
        return companyList;
    }

    public void add(Company company){
        companyList.add(company);
    }
}
