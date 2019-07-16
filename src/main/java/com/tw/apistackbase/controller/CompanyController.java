package com.tw.apistackbase.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController

    public class CompanyController {
@Autowired
    private CompanyRepository companyRepository;


    @GetMapping("/companies")
    public ResponseEntity get_companies() {

        return ResponseEntity.ok(companyRepository.getCompanies());
    }





    }
