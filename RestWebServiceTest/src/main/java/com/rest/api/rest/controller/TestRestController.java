package com.rest.api.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestRestController {
	
	@RequestMapping(value="/hello/{id}",method= {RequestMethod.GET},produces="text/plain")
	public String sayHello(@PathVariable(name="id") String name)
	{
		return "Hello "+name;
	}

}
