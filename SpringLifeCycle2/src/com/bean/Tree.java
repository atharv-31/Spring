package com.bean;

import java.io.Serializable;

public class Tree implements Serializable {
	
	private int ht;
	private String name;
	
	
	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Tree(int ht, String name) {
		super();
		this.ht = ht;
		this.name = name;
	}


	public int getHt() {
		return ht;
	}


	public void setHt(int ht) {
		this.ht = ht;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Tree [ht=" + ht + ", name=" + name + "]";
	}
	
	public void initmethod() {
		System.out.println("Intialized method");
	}
	
	public void destroy() {
		System.out.println("Destroyed method");
	}

}
