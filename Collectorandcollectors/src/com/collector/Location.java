package com.collector;

public class Location {
	private String name;
	private String state;
	//Location loc=new Location();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Location(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Location [name=" + name + ", state=" + state + "]";
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}