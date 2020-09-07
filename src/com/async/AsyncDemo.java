package com.async;

public class AsyncDemo {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Xerox xe1 = new Xerox();
		xe1.copy("hanumanChalisa", "hanumanChalisaCopy");
		
		Xerox xe2 = new Xerox();
		xe2.copy("ReReBhajarangi", "ReReBhajarangiCopy");
		
		System.out.println("Completed!");
		long end = System.currentTimeMillis(); 
		
		System.out.println("Total time taken : " +(end-start) + " ms." ) ;
	}
}
