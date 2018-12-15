package com.employee.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.model.Employee;
@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
