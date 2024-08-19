package com.trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {

	Node root = new Node();
	
	public static void main(String[] args) {
		List<String> dictionary = new ArrayList<>();
		/*dictionary.add("ti");
		dictionary.add("tu");
		dictionary.add("of");
		dictionary.add("and");
		dictionary.add("sand");
		dictionary.add("lay");
		dictionary.add("tur");*/
		
		dictionary.add("cat");
		dictionary.add("rat");
		dictionary.add("bat");
		
		//String sentence = "tiny turtles playing on the sandy shore";
		String sentence = "the cattle was rattled by the battery"; 
		
		
		ReplaceWords replaceWords = new ReplaceWords();
		String modified = replaceWords.replaceWords(dictionary,sentence);
		System.out.println(modified);
	}

	private  String replaceWords(List<String> dictionary, String sentence) {
		
		Collections.sort(dictionary);
		
		for(String str: dictionary){
			Node node = root;
			for(char ch : str.toCharArray()){
				int index = ch - 'a';
				if(node.child[index] == null){
					node.child[index] = new Node();
					if(str.charAt(str.length()-1) == ch){
						node.child[index].end = true;
					}
				}
				node = node.child[index];
			}
		}
		
		
		String res = "";
		for(String str : sentence.split(" ")){
			Node node = root;
			for(char ch : str.toCharArray()){
				int index = ch -'a';
				if(node.child[index] != null){
					if(node.child[index].end){
						res = res + str.substring(0, str.indexOf(ch)+1) + " ";
						break;
					}
					node = node.child[index];
				}else{
					res = res + str + " ";
					break;
				}
			}
		}
		
		return res;
	}
}
