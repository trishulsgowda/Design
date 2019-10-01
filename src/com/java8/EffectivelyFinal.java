package com.java8;

import java.util.Arrays;
import java.util.List;

public class EffectivelyFinal {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3);
		
		/*numbers.stream()
		.map(n -> n *2)
		.forEach(n -> System.out.println(n));*/
		
		// here map has a lambda
		
		// if we want to change 2 to a local variable, we can do it. 
		// That variable will be effectively final. Meaning, there's no need 
		// to mention final keyword explicitly.
		
		// When we use the a local variable it works perfectely fine, but when we try to modify the local variable, the compiler 
		// screams an error.
		
		int factor = 2;
		
		numbers.stream()
		.map(n -> n * factor)
		.forEach(n -> System.out.println(n));
		
		
		// When we write a lambda, it should follow 2 rules.
		// 1. it should not change anything
		// 2. It should not depend on thing that changes
		// Here factor is effectively final since it is used in lambda expression.
		
		 //factor = 0; 
		// When we try to change factor compiler will say, 
		 //local variable defined in enclosing scope must be final or effectively final
		
		/*
		 * Demonstrate Lazy evaluation
		 */
	}
}
