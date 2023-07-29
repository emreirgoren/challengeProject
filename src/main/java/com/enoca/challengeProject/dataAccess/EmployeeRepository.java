package com.enoca.challengeProject.dataAccess;

import com.enoca.challengeProject.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
