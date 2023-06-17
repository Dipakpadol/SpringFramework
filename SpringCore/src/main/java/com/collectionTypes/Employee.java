package com.collectionTypes;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
      private int employeeId;
      private List<String> employeeNames;
      private Set<String> employeeAddresses;
      private Map<String, String> Courses;
      
      public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public List<String> getEmployeeNames() {
		return employeeNames;
	}
	public void setEmployeeNames(List<String> employeeNames) {
		this.employeeNames = employeeNames;
	}
	public Set<String> getEmployeeAddresses() {
		return employeeAddresses;
	}
	public void setEmployeeAddresses(Set<String> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	public Employee(int employeeId, List<String> employeeNames, Set<String> employeeAddresses,
			Map<String, String> courses) {
		super();
		this.employeeId = employeeId;
		this.employeeNames = employeeNames;
		this.employeeAddresses = employeeAddresses;
		Courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeNames=" + employeeNames + ", employeeAddresses="
				+ employeeAddresses + ", Courses=" + Courses + "]";
	}
	
}
