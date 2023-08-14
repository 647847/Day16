package com.mystream;
import java.util.stream.*;
public class ConcatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> str1=Stream.of(11,13,15,17,19);
		Stream<Integer> str2=Stream.of(12,14,16,18,20);
		Stream<Integer> str3=Stream.concat(str1, str2);
		str3.forEach(System.out::println);
		
		//stream.distinct().forEach(System.out::println);
		//stream.filter((e)->e>15).forEach(System.out::println) ---get values greater than 15
		//SOP(stream.findAny().get());
		//SOP(stream.findFirst().get());
	
	}

}
