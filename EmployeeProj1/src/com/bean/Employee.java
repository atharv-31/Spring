package com.bean;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	private Address address;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(int id, String name, double salary , Address address) {
		
		System.out.println("Parametrized Construxcotr");
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
		
	}

	public Employee(Address address) {
		System.out.println("EMployee with address");
		this.address=address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	

	
	
	
}
