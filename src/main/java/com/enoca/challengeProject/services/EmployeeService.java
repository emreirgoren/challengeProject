package com.enoca.challengeProject.services;

import com.enoca.challengeProject.dataAccess.EmployeeRepository;
import com.enoca.challengeProject.entities.Company;
import com.enoca.challengeProject.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //GetAll
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    //GetEmployee
    public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    //CreateEmpyloyee
    public Employee createEmploye(Employee employee) {
        return employeeRepository.save(employee);
    }

    //DeleteEmployee
    public void deleteEmployeeById(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    //UpdateEmpyloyee
    public Employee updateEmployee(Long employeeId, Employee newEmployee) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()) {
            Employee employeToUpdate = employee.get();
            //employeToUpdate.setEmployeeId(employeToUpdate.getEmployeeId());
            employeToUpdate.setFirstName(newEmployee.getFirstName());
            employeToUpdate.setLastName(newEmployee.getLastName());
            employeToUpdate.setIdentityNo(newEmployee.getIdentityNo());
            employeeRepository.save(employeToUpdate);
            return employeToUpdate;
        } else {
            return null;
        }
    }
}
