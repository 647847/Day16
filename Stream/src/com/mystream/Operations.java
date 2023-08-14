package com.mystream;
import java.util.*;
import java.util.stream.*;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list=new ArrayList();
		list.add(new Customer("peter","Mumbai","basic",3,990));
		list.add(new Customer("edick","Pune","a",4,840));
		list.add(new Customer("nick","Mumbai","q",3,390));
		list.add(new Customer("Carrie","Hyderabad","q",5,440));
		Stream<Customer> str=list.stream();
		//str.filter((e)->e.getPlanRange()==3).forEach(System.out::println);
		//str.filter((e)->e.getAmount()>500).forEach(System.out::println);
		//System.out.println(str.allMatch((e)->e.getAmount()>300));
		//System.out.println(str.anyMatch((e)->e.getAmount()>300));
		str.filter((e)->e.getLocation().equals("Mumbai")).map((e)->e.getAmount()*20/100+e.getAmount()+" "+e.getLocation()).forEach(System.out::println);
		
		
		
		
	}

}
