package com.bean;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id ;
	private String name;
	private double salary;
	
	//Reference Type
	private Address address;
	
	public Employee() {
		System.out.println("Employee Default Constructor");
		
	}

	public Employee(int id, String name, double salary, Address address) {
		
		super();
		System.out.println("Employee with all fields");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee(int id, String name, double salary) {
		super();
		System.out.println("Employee with id, name , salary");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 public Employee (Address address) {
		 System.out.println("Employee Address");
		 this.address=address;
	 }

	 public int getId() {
		 return id;
	 }

	 public void setId(int id) {
		 System.out.println("Set id called");
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 System.out.println("Set name called");
		 this.name = name;
	 }

	 public double getSalary() {
		 return salary;
	 }

	 public void setSalary(double salary) {
		 System.out.println("Set salary called");
		 this.salary = salary;
	 }

	 public Address getAddress() {
		 return address;
	 }

	 public void setAddress(Address address) {
		 System.out.println("Set Address called");
		 this.address = address;
	 }

	 @Override
	 public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	 }

	 
	 

}
