package com.async;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncDemo {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		/*Xerox xe1 = new Xerox();
		xe1.copy("hanumanChalisa", "hanumanChalisaCopy");
		
		Xerox xe2 = new Xerox();
		xe2.copy("ReReBhajarangi", "ReReBhajarangiCopy");
		*/
		List<Xerox> xeroxTasks = new ArrayList<>();
		xeroxTasks.add(new Xerox("hanumanChalisa", "hanumanChalisaCopy"));
		xeroxTasks.add(new Xerox("ReReBhajarangi", "ReReBhajarangiCopy"));
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<?> ft1 = es.submit(new Xerox("hanumanChalisa", "hanumanChalisaCopy"));
		es.submit(new Xerox("ReReBhajarangi", "ReReBhajarangiCopy"));
		
		while(!ft1.isDone()){
		}
		System.out.println("Completed!");
		long end = System.currentTimeMillis(); 
		
		System.out.println("Total time taken : " +(end-start) + " ms." ) ;
		
		es.shutdown();
	}
}
