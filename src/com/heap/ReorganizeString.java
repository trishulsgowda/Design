package com.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {

	public static String reorganizeString(String string1) {
		
		String res = "";

		Map<String, Integer> map = new HashMap<>();
		PriorityQueue<String[]> heap = new PriorityQueue<>((s1,s2) -> Integer.valueOf(s2[1]) - Integer.valueOf(s1[1]));
		
        for(int i=0; i<string1.length(); i++){
        	String c = String.valueOf(string1.charAt(i));
        	if(!map.containsKey(c)){
        		map.put(c, 1);
        	}
        	else{
        		map.put(c, map.get(c) + 1);
        	}
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
        	String[] item = new String[]{String.valueOf(entry.getKey()), String.valueOf(entry.getValue())};
        	heap.add(item);
        }
        
        
        
        String[] previous = null;
        while(!heap.isEmpty()){
        	String[] item = heap.remove();
        	
        	res = res + item[0];
        	int itemCount = map.get(item[0]);
        	if(itemCount > 1 && heap.isEmpty()){
        		return "";
        	}
        	
        	itemCount = itemCount -1;
        	item[1] = String.valueOf(itemCount);
        	
        	
        	map.put(item[0], itemCount);
        	
        	if(previous!= null && Integer.valueOf(previous[1])>0){
        		heap.add(previous);
        	}
        	
        	previous = item;
        }
    
        return res;
    }
	
	public static void main(String[] args) {
		String str = "aaabc";
		
		System.out.println(reorganizeString(str));
	}
	
	
}
