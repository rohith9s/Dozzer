package com.dozer.demo;

import org.dozer.Mapping;

public class Employee {
	 
	private String name;
 
    @Mapping("batchName")
    private String batch;
 
    @Mapping("homeAddress")
    private String address;


	public Employee(String name, String batch, String address) {
		super();
		this.name = name;
		this.batch = batch;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
 
}