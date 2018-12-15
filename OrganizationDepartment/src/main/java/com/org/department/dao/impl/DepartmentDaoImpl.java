package com.org.department.dao.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.department.dao.DepartmentDao;
import com.org.department.model.Department;
import com.org.department.model.DepartmentResponse;
import com.org.department.repository.DepartMentRepository;
@Component
public class DepartmentDaoImpl implements DepartmentDao {
    @Autowired
	DepartMentRepository departMentRepository;
	public DepartMentRepository getDepartMentRepository() {
		return departMentRepository;
	}

	public void setDepartMentRepository(DepartMentRepository departMentRepository) {
		this.departMentRepository = departMentRepository;
	}

	@Override
	public DepartmentResponse getDepartMentById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long createDeaprtment(Department department) {
		// TODO Auto-generated method stub
		Department depar=departMentRepository.save(department);
		return depar.getDepartmentId();
	}
	
	@Override
	public DepartmentResponse updateDepartment(Long Id, Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentResponse deleteDepartment(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
