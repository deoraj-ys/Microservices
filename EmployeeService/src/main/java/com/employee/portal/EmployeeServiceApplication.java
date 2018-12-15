package com.employee.portal;

import java.util.HashMap;
import java.util.Map;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;


import com.employee.model.Employee;

@SpringBootApplication(scanBasePackages= {"com.employee"})
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableJpaRepositories(basePackages="com.employee.data.repository")
@EntityScan("com.employee.model")  

public class EmployeeServiceApplication {

	public static Map<Integer,Employee> employeeMap=new HashMap<Integer,Employee>();
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}
	/*below configuration is requred to configure resttmplate in loadbalancer mode
	@LoadBalanced*/
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}
        
    

    }

