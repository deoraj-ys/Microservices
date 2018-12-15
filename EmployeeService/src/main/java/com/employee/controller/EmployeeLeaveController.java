package com.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.EmployeeLeave;

@RestController
@RequestMapping(value="/leaves")
public class EmployeeLeaveController {
	
	@RequestMapping(value="/{id}", method= RequestMethod.GET,produces= {"application/xml","application/json"})
	@ResponseBody
	public List<EmployeeLeave> getEmployeeLeaves(@PathVariable(name="id") int id)
	{
		return null;
	}

}
