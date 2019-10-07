package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TheFlowOfData {
	
	public static int transform(int n){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return n*n;
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Stream<Integer> stream = numbers.stream();
		
		stream.filter(n -> n%2==0).map(n -> transform(n)).forEach(System.out::println);
		// Filter and Map are Intermediate operations whereas forEach is terminal operation
		
		// Demonstrating lazy evaluation - Here we demonstrate that an intermediate operation is never called when terminal operation is not called.
		// The execution will kick in only when the terminal operation is  encountered.
		//stream.filter(n -> n%2==0).map(n -> {System.out.println("Map is called"); return n*n;}).forEach(System.out::println);
		
		
		// Demonstrating that a stream is closed when terminal operation is called.
		//System.out.println(stream.min(Integer::compare));
		
		
		// Demonstrating the power of parallel streams
		//stream.parallel().filter(n -> n%2==0).map(n -> transform(n)).forEach(System.out::println);
		
	}
}
