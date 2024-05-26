package com.subsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combinations {

	public static void main(String[] args) {
		String digits = "23";
		
		List<String> combinations = letterCombinations(digits);
		combinations.stream().forEach(System.out::println);
	}
	
	public static List<String> letterCombinations(String digits){

        List<String> combinations = new ArrayList<>();
        
        Map<Character, char[]> mapping = new HashMap<>();
        mapping.put('2', new char[]{'a','b','c'});
        mapping.put('3', new char[]{'d','e','f'});
        mapping.put('4', new char[]{'g','h','i'});
        mapping.put('5', new char[]{'j','k','l'});
        mapping.put('6', new char[]{'m','n','o'});
        mapping.put('7', new char[]{'p','q','r','s'});
        mapping.put('8', new char[]{'t','u','v'});
        mapping.put('9', new char[]{'w','x','y','z'});
        
        if(digits.length() == 0){
        	return combinations;
        }

        String result = "";
        combinations(digits, 0, mapping, combinations,result);
        return combinations;
    }

	private static void combinations(String digits, int index, Map<Character, char[]> mapping,List<String> combinations, String result) {
		
		if(result.length() == digits.length()){
			combinations.add(result);
			return;
		}
		
		Character digit = digits.charAt(index);
		char[] chars = mapping.get(digit);
		
		for(char c : chars){
			result = result + String.valueOf(c);
			combinations(digits, index + 1, mapping, combinations, result);
		    result = result.substring(0,result.length()-1);
		}
	}
}
