package com.org.department;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.org.department.model.Department;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.org.department.repository"})
@EnableEurekaClient
public class OrganizationDepartmentApplication {

	public static Map<String,Department> deploymentMap=new HashMap<String,Department>();

	public static void main(String[] args) {
		SpringApplication.run(OrganizationDepartmentApplication.class, args);
	}
}
