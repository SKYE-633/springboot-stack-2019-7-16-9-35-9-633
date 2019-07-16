package com.tw.apistackbase.controller;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CompanyControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private CompanyController companyController;
    private CompanyRepository mockCompanyRepository;

//    @Test
//    public void should_return_companies_when_have_all_companies_API() throws Exception{
//        mockCompanyRepository= Mockito.mock(CompanyRepository.class);
//        List<Company> mockCompanyRepository = new ArrayList<>();
//        mockCompanyList.add(new Company("alibaba",200,new EmployeeRepository().getEmployees()));
//        Mockito.when(mockCompanyRepository.getCompanies()).thenReturn(mockCompanyList);
//
//    }
}