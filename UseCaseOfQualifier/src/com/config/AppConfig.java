package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.bean.Address;
import com.bean.Employee;

@Configuration 
public class AppConfig {
	
	@Bean
	public Address homeAddress() {
		return new Address("MH","Pune",412364);
		
	}
	
	@Bean
	public Employee employee1() {
		Employee employee=new Employee(101,"Sachin",4555);
		employee.setAddress(homeAddress());
		return employee;
	}
}
