package com.dozer.demo;

import java.util.List;

public class DestinationOrganizationObject {

	private String id;
	private EmployeeVO executiveObj; 
	List<EmployeeVO> executives;
	
	public List<EmployeeVO> getExecutives() {
		return executives;
	}

	public void setExecutives(List<EmployeeVO> executives) {
		this.executives = executives;
	}

	public EmployeeVO getExecutiveObj() {
		return executiveObj;
	}

	public void setExecutiveObj(EmployeeVO executiveObj) {
		this.executiveObj = executiveObj;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DestinationOrganizationObject [id=" + id + ", executiveObj=" + executiveObj + ", executives="
				+ executives + "]";
	}
	
	
}