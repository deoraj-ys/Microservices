package com.employee.dao.impl;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.dao.EmployeeDAO;
import com.employee.data.repository.EmployeeRepository;
import com.employee.model.Employee;
import com.employee.model.EmployeeResponse;
import com.employee.portal.EmployeeServiceApplication;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
@Service
public class EmployeeDAOImpl implements EmployeeDAO {
   
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
    private EurekaClient eurekaClient;
	
	public EurekaClient getEurekaClient() {
		return eurekaClient;
	}

	public void setEurekaClient(EurekaClient eurekaClient) {
		this.eurekaClient = eurekaClient;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	
    
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Collection<Employee> getAllEmployee() {
		System.out.println("ok");
		
		
		return  employeeRepository.findAll().stream().map(item->item).collect(Collectors.toList());
	}

	@Override
	public Employee getEmployeeById(Long id) {
		//Employee employee= EmployeeServiceApplication.employeeMap.get(id);	
		Optional<Employee> employee=employeeRepository.findById(id);
		 System.out.println("We have completed your request and snt the response and employee data=="+employee);
		if(employee.isPresent())
		{
		     return employee.get();	
		}
		return null;
	}

	@Override
	public EmployeeResponse saveEmployee(Employee employee) {
		System.out.println("address"+employee.getAddress());
		employee=employeeRepository.save(employee);
		return null;//new EmployeeResponse(101,"Created SuccessFully");
		
	}

	@Override
	public EmployeeResponse updateEmployee(Long id, Employee employee) {
		//EmployeeServiceApplication.employeeMap.put(id,employee);
		return new EmployeeResponse(id,"Employee Update Success");
	}

	@Override
	public EmployeeResponse deleteEmployee(Long id) {
		EmployeeServiceApplication.employeeMap.remove(id);
		return new EmployeeResponse(id,"Deleted Successfully");
	}

	@Override
	@HystrixCommand(fallbackMethod="pingServiceError",commandKey="employeedao")
	public boolean pingService() {
		// TODO Auto-generated method stub
		System.out.println("Ping started for Department service") ;
		Application application=eurekaClient.getApplication("DEPARTMENT");
		System.out.println("fetching Department reference from registry") ;
		InstanceInfo instanceInfo=application.getInstances().get(0);
		String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/" + "department/ping/";
        System.out.println("URL" + url);
        String ping = restTemplate.getForObject(url, String.class);
        System.out.println("RESPONSE " + ping);
		return true;
	}
	public boolean pingServiceError() {
		// TODO Auto-generated method stub
		System.out.println("Department Service is Either ShutDown Or Not Respnding on time");
		return false;
	}
}
