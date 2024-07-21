package com.sharif.crudoperation.repository;


import com.sharif.crudoperation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}