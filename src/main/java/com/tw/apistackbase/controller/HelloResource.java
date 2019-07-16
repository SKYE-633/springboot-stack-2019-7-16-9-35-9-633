package com.tw.apistackbase.controller;

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
@RequestMapping("/employees")

public class HelloResource {

    private final Logger log = Logger.getLogger(this.getClass().getName());
    private List<Employee> result = new ArrayList();
//    @GetMapping(path = "/{userName}", produces = {"application/json"})
//    public ResponseEntity<String> getAll(@PathVariable String userName) {
//
//        return ResponseEntity.ok("Hello:" + userName);
//    }


    @GetMapping()
    public ResponseEntity get_All_employees(){

        result.add(new Employee(4,"alibaba1",20,"male",6000));
        return ResponseEntity.ok().body(result);
    }


    @PostMapping()
    public ResponseEntity create_employees(@RequestBody Employee employee){
        result.add(employee);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity put_employeea(@PathVariable Integer id,@RequestBody Employee employee){
        result.add(employee);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete_employees(@PathVariable Integer id,@RequestBody Employee employee){
        result.remove(employee);
        return ResponseEntity.ok().build();
    }



}
