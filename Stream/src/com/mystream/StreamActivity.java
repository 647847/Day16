package com.mystream;
import java.util.*;
import java.util.stream.Stream;

public class StreamActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Stream<String> stream=Stream.of("BaudeRate","Ohm","Kilowatt","Bits","Analog", "Digital");
		stream.forEach(System.out::println);
		
		Stream<Integer> intstream=Stream.iterate(1,n->n+2).limit(15);
		intstream.forEach(System.out::println);

		Stream<Integer> new2=Stream.generate(()->new Random().nextInt(10)).limit(10);
	}

}
