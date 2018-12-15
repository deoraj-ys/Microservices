package com.employee.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeLeaveDao;
import com.employee.model.EmployeeLeave;
@Service
public class EmployeeLeaveDaoImpl implements EmployeeLeaveDao {

	@Override
	public Collection<EmployeeLeave> getAllLeaves(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EmployeeLeave> getLeaveByStatus(int id, String byStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EmployeeLeave> getLeaveByCategory(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
