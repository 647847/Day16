package com.mystream;
import java.util.*;
import java.util.stream.DoubleStream;

import java.util.stream.Stream;
import java.util.stream.IntStream;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1
		List<String> collection=Arrays.asList("Connector","BSC","Teleprinter","Terminal");
		Stream<String> str=collection.stream();
		str.forEach(System.out::println);
		//method 2
		
		Stream<String> stream=Stream.of("Connector","BSC","TelePrinter","Terminal");
		//method 3
		
		String[] arr= {"Collection","BSc","Teleprinter","Terminal"};
		Stream<String> str1=Arrays.stream(arr);
		//method 4
		
		String[] arr1= {"Collection","BSc","Teleprinter","Terminal"};
		Stream<String> str2=Stream.of(arr1);
		Stream<String> empty_Stream=Stream.empty();//creating blank stream
		
		Stream.Builder<String> builder=Stream.builder();
		builder.add("Modem");
		//Stream<String> stream1=builder.
			//using iterator method	
		Stream<Integer> intstream=Stream.iterate(1,n->n+2).limit(15);
		intstream.forEach(System.out::println);
		
		IntStream intstr=IntStream.of(10);
		intstr.forEach(System.out::println);
		
		IntStream open=IntStream.range(1,10);//prints from 1 to 9
		open.forEach(System.out::println);
		IntStream closed=IntStream.rangeClosed(1,10);//prints from 1 to 10
		closed.forEach(System.out::println);
		DoubleStream dbs=DoubleStream.of(12,78,77,9,8.0);//no need of generic here
	    Stream<String> new1=Stream.generate(()->"Hello world").limit(10);
	    Stream<Integer> new2=Stream.generate(()->new Random().nextInt(10)).limit(10);
	    new2.forEach(System.out::println);
		
	}
	

}
