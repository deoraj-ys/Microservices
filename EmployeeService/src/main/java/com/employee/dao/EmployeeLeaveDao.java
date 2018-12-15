package com.employee.dao;

import java.util.Collection;

import com.employee.model.EmployeeLeave;

public interface EmployeeLeaveDao {
	public Collection<EmployeeLeave> getAllLeaves(int id);
	public Collection<EmployeeLeave> getLeaveByStatus(int id,String byStatus);
	public Collection<EmployeeLeave> getLeaveByCategory(int id);
	

}
