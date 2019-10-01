package com.java8;

import java.util.Arrays;
import java.util.List;

public class IterateAList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		/*for(int i : numbers){ // This is not polymorphic
			System.out.println(i);
		}*/
		
		/*numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});*/
		
		//numbers.forEach((t) -> System.out.println(t)); // // Where as this is polymorphic
		
		numbers.forEach( System.out::println);
	}
}
