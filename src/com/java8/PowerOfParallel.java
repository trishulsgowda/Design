package com.java8;

import java.util.Arrays;
import java.util.List;

public class PowerOfParallel {
	
	public static Integer logic(Integer e){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		return e * 1;
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.parallelStream().map(e -> logic(e)).forEach(System.out::println);
	}
}
