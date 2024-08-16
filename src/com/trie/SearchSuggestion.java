package com.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SearchSuggestion {

    private Node root = new Node();
    
    public void insert(String word) {
        Node node = root;
        for (char ch : word.toCharArray()){
            int index = ch - 'a';
            
            if (node.child[index] == null) {
                node.child[index] = new Node();
            }
            node = node.child[index];
            node.searchWords.offer(word);
            
            
            if (node.searchWords.size() > 3) {
                node.searchWords.pollLast();
            }
        }
    }

    public List<List<String>> search(String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Node node = root;
        for (char ch : searchWord.toCharArray()) {
            int index = ch - 'a';
            if (node != null) {
                node = node.child[index];
            }
            result.add(node == null ? Arrays.asList() : node.searchWords);
        }
        System.out.println("\t\tResult: " + result);
        return result;
    }


    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        for (String product : products) {
            insert(product);
        }
        return search(searchWord);
    }
    
    public static void main(String[] args){
        String[] products = {"bat", "bag", "bassinet", "bread"};
        String[] searchWordList = {"br"};
       
        for(int i=0; i<searchWordList.length; i++){
            SearchSuggestion obj = new SearchSuggestion();
            
            System.out.println("\tSuggested Products: " + obj.suggestedProducts(products, searchWordList[i]));
            System.out.println("---------------------------------------");

        }
    }
}




