package com.spring.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Serializable {
	@Value("111")
	private int id;
	@Value("Sahil")
	private String name;
	@Value("65987")
	private double salary;

	public Employee() {
		System.out.println("Defalut Constructor");
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Set Id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Set Name");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Set Salary");
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}