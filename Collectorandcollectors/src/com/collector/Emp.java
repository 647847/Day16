package com.collector;
import java.util.stream.*;
import java.util.*;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> e1=new ArrayList();
		e1.add(new Employee("john","peter",new Department("Sales","hyderabad"),new Designation("manager")));
		e1.add(new Employee("nick","carrie",new Department("testing","pune"),new Designation("Asst.Manager")));
		e1.add(new Employee("Paul","Erric",new Department("Development","Mumbai"),new Designation("Engineer")));
		//List<Employee> empstr=e1.stream().filter((e)->e.getDepartment().getDepartmentName().equals("Sales")&&e.getDesignation().getDesignation_type().equals("manager")).collect(Collectors.toList());
		
		//List<Employee> empstr=e1.stream().filter((e)->e.getDepartment().getLocation().equals("Mumbai")).collect(Collectors.toList());
		
		List<String> empstr=e1.stream().collect(Collectors.mapping((Employee e)->e.getFirstName()+" "+e.getLastName(),Collectors.toList()));
		System.out.println(empstr);
	}
	
	
	

}
