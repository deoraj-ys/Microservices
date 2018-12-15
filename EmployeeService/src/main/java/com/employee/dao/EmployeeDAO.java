package com.employee.dao;

import java.util.Collection;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.model.EmployeeResponse;
@Service
public interface EmployeeDAO {
	public Collection<Employee> getAllEmployee();
	public Employee getEmployeeById(Long id);
	public EmployeeResponse saveEmployee(Employee employee);
	public EmployeeResponse updateEmployee(Long id,Employee employee);
	public EmployeeResponse deleteEmployee(Long id);
	public boolean pingService();
	
	

}
