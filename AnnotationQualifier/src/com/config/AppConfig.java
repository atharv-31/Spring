package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bean.Address;

@Configuration
@ComponentScan(basePackages="com")
public class AppConfig {
	
	@Bean
	@Primary
	public Address homeAddress() {
		return new Address("MH","Pune",412563);
	}
	
	@Bean
	public Address workAddress() {
		return new Address("MH","Latur",412588);
	}

}
