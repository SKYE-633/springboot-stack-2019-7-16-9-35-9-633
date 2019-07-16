package com.tw.apistackbase.controller;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyRepository {
    private List<Company> companyList;

    public CompanyRepository() {
    }

    public CompanyRepository(List<Company> companyList){
        this.companyList = companyList;
        companyList.add(new Company("alibaba",200,new EmployeeRepository().getEmployees()));

    }
    public List<Company> getCompanies(){
        return companyList;
    }
    public void add(Company company){
        companyList.add(company);
    }
}
