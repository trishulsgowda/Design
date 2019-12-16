package com.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SelectFromBuckets {

	public static void main(String[] args) {
		String str = "123456789";
		int x=3;
		
		List<Character> list = new ArrayList<>();
		Set<Integer> set = new TreeSet<>();
		func(str,list,0,x,set); 
	}

	private static void func(String str, List<Character> list, int s, int x, Set<Integer> set) {
		if(s > str.length()-x) return;
		
		for(int i=s ; i<s+x ; i++){
			list.add(str.charAt(i));
			
			func(str, list, s+3, x, set);
			
			if(list.size()==3){
				list.stream().forEach(System.out::print);
				System.out.println("\n");
			}
			list.remove(list.size()-1);
		}
	}
}
