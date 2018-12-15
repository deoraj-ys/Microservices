package com.org.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.department.model.Department;

public interface DepartMentRepository extends JpaRepository<Department, Long> {

}
