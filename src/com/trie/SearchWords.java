package com.trie;

import java.util.ArrayList;
import java.util.List;

public class SearchWords {
	
	Node root = new Node();

	public static void main(String[] args) {
		List<String> products = new ArrayList<>();
		products.add("bat"); products.add("bag"); products.add("bass"); products.add("bread");
		SearchWords searchWords = new SearchWords();
		
		for(String product: products){
			searchWords.insert(product);
		}
		
		List<List<String>> result = searchWords.getSuggestions("br");
		System.out.println(result);
	}

	private List<List<String>> getSuggestions(String ss) {
		List<List<String>> result = new ArrayList<>();
		Node node = root;
		
		for(char ch: ss.toCharArray()){
			int index = ch - 'a';
			
			if(node.child[index] != null){
				result.add(node.child[index].searchWords);
			}
			node = node.child[index];
		}
		
		return result;
	}

	private void insert(String product) {
		Node node = root;
		
		for(char ch : product.toCharArray()){
			int index = ch - 'a';
			if(node.child[index] == null){
				node.child[index] = new Node();
			}
			node = node.child[index];
			node.searchWords.add(product);
			
			if(node.searchWords.size() > 3){
				node.searchWords.removeLast();
			}
		}
	}
	
	
}
