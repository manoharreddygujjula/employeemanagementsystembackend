package com.manohar.employeemanagementsystembackend.repository;

import com.manohar.employeemanagementsystembackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
