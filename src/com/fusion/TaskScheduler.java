package com.fusion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskScheduler {

	public static int leastTime(char[] tasks, int n) {
	    
	    Map<Character, Integer> freq = new HashMap<>();
	    
	    for(char t: tasks){
	    	freq.put(t, freq.getOrDefault(t, 0) + 1);
	    }
	    
	    List<Map.Entry<Character, Integer>> sortedFreq = new ArrayList<>(freq.entrySet());
	    
	    Collections.sort(sortedFreq, (a,b) -> b.getValue().compareTo(a.getValue())); // [Y=1, B=2, A=3, M=3]
	    
	    int maxFreq = sortedFreq.get(0).getValue();
	    
	    int idletime = (sortedFreq.get(0).getValue() - 1) * n;
	    sortedFreq.remove(0);
	    
	    while(!sortedFreq.isEmpty() && idletime>0){
	    	idletime = idletime - Math.min(maxFreq-1, sortedFreq.get(0).getValue());
	    	sortedFreq.remove(0);
	    }
	    
	   int total = idletime + tasks.length; 
	   System.out.println("Sum:" + total);
		
		
	    return total;
	  }
	
	public static void main(String[] args) {
		char[] alltasks = {'M', 'A', 'B', 'M', 'A', 'A', 'Y', 'B', 'M'}; //M3,A3,B2,Y1
		int n=3;
		
		leastTime(alltasks, n);
		
	}
}
