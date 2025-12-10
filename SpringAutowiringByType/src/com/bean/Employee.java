package com.bean;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	//refernce type
	
	private Address address;
	
	public Employee() {
		System.out.println("Defsult constructor Employee");
	}
	
	

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public Employee(int id, String name, double salary, Address address) {
		System.out.println("Employee with aall fields");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee(Address address) {
		System.out.println("Employee with Address");
		this.address=address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Set ID");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Set name");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Set salary");
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
