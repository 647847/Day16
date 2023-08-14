package com.mystream;

public class Customer {
	private String name;
	private String location;
	private String plan_type ;
	private int planRange;
	private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPlan_type() {
		return plan_type;
	}
	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}
	public int getPlanRange() {
		return planRange;
	}
	public void setPlanRange(int planRange) {
		this.planRange = planRange;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", location=" + location + ", plan_type=" + plan_type + ", planRange="
				+ planRange + ", amount=" + amount + "]";
	}
	public Customer(String name, String location, String plan_type, int planRange, int amount) {
		super();
		this.name = name;
		this.location = location;
		this.plan_type = plan_type;
		this.planRange = planRange;
		this.amount = amount;
	}
	

}
