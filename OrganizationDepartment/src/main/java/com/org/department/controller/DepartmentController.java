package com.org.department.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.department.OrganizationDepartmentApplication;
import com.org.department.dao.DepartmentDao;
import com.org.department.model.Department;
import com.org.department.model.DepartmentResponse;

@RestController
@RequestMapping(value="/department")
public class DepartmentController {
	
	private final AtomicInteger  ID=new AtomicInteger(100);
	
	@Autowired
	DepartmentDao departmentDao;
	
	@Value("${eureka.instance.instance-id}")
	 private String instanceId;

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	@RequestMapping(value="/ping", method= {RequestMethod.GET},produces= {"test/plain"})
	public String testRest()
	{
		System.out.println("Hi there! instance id: " + instanceId);		
		return "Rest Test "+" Verified SuccessFully Wow you have nailed it";
	}
	@RequestMapping(value="all", method= {RequestMethod.GET},produces= {"application/json","application/xml"})
	public List<Department> getAllDepartMent()
	{
				
		return OrganizationDepartmentApplication.deploymentMap.values().stream().collect(Collectors.toList());
	}

	@RequestMapping(value="/{id}" ,method= {RequestMethod.GET},produces= {"application/xml","application/json"})
	public Department getDepartMentByID(@PathVariable(name="id") String id)
	{
		return OrganizationDepartmentApplication.deploymentMap.get(id);
	}
	@RequestMapping(value="/create",method= {RequestMethod.POST},consumes= {"application/json","application/xml"},produces= {"application/json","application/xml"})
	public DepartmentResponse  createDepartment(@RequestBody Department department)
	{
		//String id="CIB"+ID.incrementAndGet();
	//	OrganizationDepartmentApplication.deploymentMap.put(id,department);
		Long id=departmentDao.createDeaprtment(department);
		
		return new DepartmentResponse(id.toString(),"Created SuccessFully");
	}
	@RequestMapping(value="/update/{id}",method= {RequestMethod.PUT},consumes= {"application/json","application/xml"},produces= {"application/json","application/xml"})
	public DepartmentResponse updateDepartment(@PathVariable(name="id") String id)
	{
		return new DepartmentResponse(id,"Updated SuccessFully");
	}
	@RequestMapping(value="/delete/{id}",method= {RequestMethod.DELETE},produces= {"application/json","application/xml"})
	public DepartmentResponse deleteDepartment(@PathVariable(name="id") String id)
   {
		return new DepartmentResponse(id,"Deleted SuccessFully");
		
   }
   }
