package com.org.department.dao;

import com.org.department.model.Department;
import com.org.department.model.DepartmentResponse;

public interface DepartmentDao {
	
	public DepartmentResponse getDepartMentById(Long Id);
	public Long createDeaprtment(Department department);
	public DepartmentResponse updateDepartment(Long Id,Department department);
	public DepartmentResponse deleteDepartment(Long Id);
	
	

}
