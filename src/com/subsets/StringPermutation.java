package com.subsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		String str = "bad";
		
		Set<String> set = new HashSet<>();
		
		permute(set, str,0);
		
		set.stream().forEach(n -> System.out.println(n));
		
	}

	private static void permute(Set<String> set,String str, int n) {
		
		
		for(int i=n ; i< str.length(); ){
			
			str = swap(str,i,n);
			set.add(str);
			permute(set, str, n + 1);
			i++;
		}
		
	}

	private static String swap(String str, int i, int n) {
		char[] ch = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[n];
		ch[n] = temp;
		
		return new String(ch);
	}
}
