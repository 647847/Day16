package com.collector;
import java.util.*;
public class Employee {
	private String firstName ;
    private String lastName;
    private Department department;
    private Designation designation ;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public Employee(String firstName, String lastName, Department department, Designation designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", designation=" + designation + "]";
	}

}
