package com.stack;

import java.util.Stack;

public class RemoveDuplicates {

	public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
          if(!stack.isEmpty()){
        	  if(s.charAt(i) == stack.peek()){
        		  stack.pop();
        		  continue;
        	  }
          }
          stack.push(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
        	sb.append(stack.pop());
        }
        
        sb = sb.reverse();
        return sb.toString();
    }
	
	public static void main(String[] args) {
		String result = removeDuplicates("ggaabcdeb");
		System.out.println(result);
	}
}
