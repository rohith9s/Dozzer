package com.dozer.demo;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class DozerAnnotationExample {
	 
    public static void main(String[] args)
    {
    	/*
    	 *  Observe the fields {@link com.dozer.demo.SourceOranizationObject}, 
    	 *  {@link com.dozer.demo.EmployeeVO}, {@link com.dozer.demo.DestinationOrganizationObject},
    	 *  {@link com.dozer.demo.Employee} which are annotated with @Mapping("source/destination fieldName")
    	 */
        SourceOranizationObject sourceObject = new SourceOranizationObject();
        sourceObject.setId("1"); 
  
        List<Employee> srcEmployees = new ArrayList<Employee>();  
        srcEmployees.add(new Employee("Srikanth", "2", "India"));  
        srcEmployees.add(new Employee("Sai Kiran", "3", "US"));
        srcEmployees.add(new Employee("Kalyan", "4", "India"));
        
        sourceObject.setSubordinates(srcEmployees);
        
        sourceObject.setEmployee(new Employee("Hari", "1", "India")); 
        
        DestinationOrganizationObject targetObj = new DozerBeanMapper().map(sourceObject, DestinationOrganizationObject.class);
        System.out.println( targetObj);
    }
}