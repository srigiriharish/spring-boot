package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public int create(Employee employee){
      Employee employeeResult=  employeeRepository.save(employee);
      return employeeResult.getId();
    }
    public int update(Employee employee){
        Employee employeeResult=  employeeRepository.saveAndFlush(employee);
        return employeeResult.getId();

    }
    public List<Employee> getAll(){
       return employeeRepository.findAll();
    }

    public void createAll(List<Employee> employeeList){
        for(Employee employee:employeeList){
            employeeRepository.save(employee);
        }
    }
}
