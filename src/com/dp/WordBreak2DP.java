package com.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class WordBreak2DP {

	public static void main(String[] args) {
		String s = "catsanddog";
		 List<String> wordDict = new ArrayList<>();
		 wordDict.add("cat"); wordDict.add("and"); wordDict.add("cats"); wordDict.add("dog"); wordDict.add("sand");
		 
		// String s = "vegan";
		// List<String> wordDict = new ArrayList<>();
		// wordDict.add("veg"); wordDict.add("vegan"); wordDict.add("an");
		
		List<String> sentences =  wordbreak(s, wordDict);
		sentences.stream().forEach(n -> System.out.println(n));
	}

	private static List<String> wordbreak(String s, List<String> wordDict) {
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(int i=0; i<=s.length(); i++){
			String word = s.substring(0,i);
			
			System.out.println("Word: " + word);
			for(int j=0; j<word.length(); j++){
				String prefix = word.substring(0, j);
				String postfix = word.substring(j, word.length());
				
				System.out.println("Prefix: " + prefix );
				System.out.println("Postfix: " + postfix);
				
				if(inDict(postfix, wordDict)){
					if(prefix != "" && map.containsKey(prefix)){
						List<String> sentences = map.get(prefix);
						for(String sentence : sentences){
							List<String> list = map.get(word);
							if(list != null)
								list.add(sentence + " " + postfix);
							else{
								List<String> list2 = new ArrayList<>();
								list2.add(sentence + " " + postfix);
								map.put(word, list2);
							}
						}
					}else{
						List<String> list = new ArrayList<>();
						list.add(postfix);
						map.put(word, list);
					}
				}
			}
			
		}
		
		return map.get(s);
	}

	private static boolean inDict(String postfix, List<String> wordDict) {
		
		Optional<String> pf =  wordDict.stream().filter(n -> n.equals(postfix)).findAny();
		return pf.isPresent();
	}
}
