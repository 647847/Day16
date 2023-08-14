package com.collector;
import java.util.*;
import java.util.stream.*;
public class ListCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numlist=Arrays.asList(12,34,67,89);
		List<Integer> newlist=numlist.stream().filter((e)->e>25).map((e)->e*e).collect(Collectors.toList());
		System.out.println(newlist);
		

	}

}
