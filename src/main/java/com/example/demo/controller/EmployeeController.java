package com.example.demo.controller;

import com.example.demo.service.EmployeeService;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/create")
    @ResponseBody
    @CrossOrigin
    public int create(@RequestBody Employee employee){
       return employeeService.create(employee);
    }

    @PostMapping("/createList")
    @CrossOrigin
    public String create(@RequestBody List<Employee> employeeList){
         employeeService.createAll(employeeList);
         return "success";
    }
    @PutMapping("/update")
    public int update(@RequestBody Employee employee){
        return  employeeService.update(employee);
    }

    @GetMapping("/getAll")
    @CrossOrigin
    public List<Employee> getAll(){
        return  employeeService.getAll();

    }
}
