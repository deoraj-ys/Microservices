package com.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:event.xml")
public class RestWebServiceTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWebServiceTestApplication.class, args);
	}

}
