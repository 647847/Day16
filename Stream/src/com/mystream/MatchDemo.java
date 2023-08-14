package com.mystream;
import java.util.stream.*;
import java.util.function.*;

public class MatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream=Stream.of(12,23,35,22,14);
		//System.out.println(stream.allMatch((e)->e%2==0));//both cannot be done at same time
		System.out.println(stream.anyMatch((e)->e%2==0));
		
	}

}
