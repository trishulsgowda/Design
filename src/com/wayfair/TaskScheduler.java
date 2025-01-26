package com.wayfair;

import java.util.PriorityQueue;

public class TaskScheduler {
	
	public static void main(String[] args) {
		//int[] taskList = {1,2,1,2,3};
		//int[] taskMemory = {1,2,3,4,2};
	    //int maxMemory =4;
	    
	    int[] taskList = {4,3,4,1,1,3,3,4,2,2,4,3,5,1,3,4,3,2,3,1};
		int[] taskMemory = {17,18,13,11,13,19,15,13,10,13,12,11,15,19,16,10,11,14,18,19};
	    int maxMemory =213;
	    
	    int minDays = minDaysToCompleteTask(taskList, taskMemory, maxMemory);
	    
	    System.out.println("Mindays:" + minDays);
	}

	private static int minDaysToCompleteTask(int[] taskList, int[] taskMemory, int maxMemory) {
		int count =0;
		PriorityQueue<Pair> queue = new PriorityQueue<>((p1,p2)-> Integer.compare(p1.task, p2.task));
		
		for(int i=0; i<taskList.length; i++){
			Pair p = new Pair(taskList[i], taskMemory[i]);
			queue.add(p);
		}
		
		while(!queue.isEmpty()){
			Pair p1 = queue.remove();
			if(p1.memory < maxMemory){
				Pair p2 = queue.peek();
				if(p2 != null && p1.task == p2.task && p1.memory + p2.memory <= maxMemory){
					queue.remove();
				}
				count++;
			}else{
				count++;
			}
		}
		return count;
	}

	
}

class Pair{
	int task;
	int memory;
	
	Pair(int task, int mem){
		this.task = task;
		this.memory = mem;
	}
	
}
