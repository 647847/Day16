package com.collector;
import java.util.*;
public class Customer {
	private String firstName;  
    private String lastName;
    private String emailId;
    private Location loc;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	public Customer(String firstName, String lastName, String emailId, Location loc) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", loc=" + loc
				+ "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
	