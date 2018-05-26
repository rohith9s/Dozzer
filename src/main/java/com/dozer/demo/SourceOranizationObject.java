package com.dozer.demo;

import java.util.List;

import org.dozer.Mapping;

public class SourceOranizationObject {

	private String id;
	/**
	 *   You can put @Mapping annotation either on getter of field directly, 
	 *   if you miss to do this you get null, since field name are differed in source & destination objects.
	 *   - There is no restriction for @Mapping annotation  to place it in source or destination object 
	 *   as it supports in bidirectional.
	 */
	@Mapping("executiveObj") 
	private Employee employee;
	private List<Employee> subordinates;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Mapping("executives") //  You can put @Mapping annotation either on getter of field directly.
	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	} 

}