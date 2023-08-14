package com.collector;
import java.util.*;
import java.util.stream.*;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> arr=new ArrayList();
		arr.add(new Customer("john","peter","gfhg@gmail.com",new Location("hyderabad","Telangana")));
		arr.add(new Customer("Abraham","cahya","utin@gmail.com",new Location("Banglore","Karnataka")));
		
		List<String> res=arr.stream().map((e)->e.getFirstName()+" "+e.getLastName()+" "+e.getLoc()).collect(Collectors.toList());
		System.out.println(res);
		

	}

}
