package com.java8;

import java.util.Arrays;
import java.util.List;

public class DeclarativeStyleOfProgramming {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int result = 0;
		for(int i : numbers)
		{
			if(i % 2 == 0)
			{
				result = result + i *2;
			}
		}
		
		System.out.println(result);
		
		
		System.out.println(numbers.stream().filter(n -> n%2==0).mapToInt(n -> n *2).sum());
	}
}
