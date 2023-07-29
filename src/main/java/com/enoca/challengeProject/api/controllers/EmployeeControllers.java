package com.enoca.challengeProject.api.controllers;

import com.enoca.challengeProject.entities.Company;
import com.enoca.challengeProject.entities.Employee;
import com.enoca.challengeProject.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeControllers {

    private EmployeeService employeeService;

    public EmployeeControllers(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    //GetAll
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    //GetEmpyloyee
    @GetMapping("/getEmployee/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") Long employeeId){
        return employeeService.getEmployee(employeeId);
    }

    //CreateEmployee
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmploye(employee);
    }

    //DeleteEmployee
    @DeleteMapping("/delete/{employeeId}")
    public void deleteEmploye(@PathVariable("employeeId") Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
    }

    //UpdateEmployee
    @PutMapping("/update/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") Long employeeId, @RequestBody Employee newEmployee){
        return employeeService.updateEmployee(employeeId,newEmployee);
    }

}
