package com.employee.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
	@Bean
	public DateFormatter dateFormatter()
	{
		return new DateFormatter();
	}

}
