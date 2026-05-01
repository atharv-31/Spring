package com.bean;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println( "Default Consrtuctor");
		
	}

	public Employee(int id, String name, double salary) {
		super();
		System.out.println( "Parametrized Consrtuctor");
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println( "Set Id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println( "Set Name");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println( "Set salaary");
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
