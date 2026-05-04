package com.bean;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Tree implements Serializable {
	
	private int ht;
	private String name;
	
	public Tree () {
		System.out.println("Default Constructor");
	}

	public int getHt() {
		return ht;
	}

	public void setHt(int ht) {
		System.out.println("Set Height");
		this.ht = ht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Set Name");
		this.name = name;
	}

	public Tree(int ht, String name) {
		super();
		this.ht = ht;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tree [ht=" + ht + ", name=" + name + "]";
	}

/*	@Override
	public void afterPropertiesSet() throws Exception {
	System.out.println("Extra Initialization");
	System.out.println("Serve water...");
	
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Release Resources");
		System.out.println("Ceromany");
		
		
	} */
	  
	
	public void initmethod() {
		System.out.println("Intialized method");
	}
	
	public void destroy() {
		System.out.println("Destroyed method");
	}
	

}
