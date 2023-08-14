package com.mystream;
import java.util.stream.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream=Stream.of(34,67,99,33);
;
		stream.map((e)->e*e).forEach(System.out::println);
	}

}
