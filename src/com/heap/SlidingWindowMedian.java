package com.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindowMedian {

	public static void main(String[] args) {
		int arr[] = {1,3,-1,-3,5,3,6,7};
		int k=3;
		
		List<Integer> list = slidingWindowMedian(arr,k);
		list.stream().forEach(System.out::println);
	}

	private static List<Integer> slidingWindowMedian(int[] arr, int k) {
	
		List<Integer> list = new ArrayList<>();
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)-> a-b);
		
		for(int i=0; i<k; i++){
			maxHeap.offer(arr[i]);
		}
		for(int i=0; i<k/2;i++){
			minHeap.offer(maxHeap.poll());
		}
		
		if(k%2==0){
			list.add((maxHeap.peek() + minHeap.peek())/2);
		}else{
			list.add(maxHeap.peek());
		}
		
		
		for(int i=k; i<arr.length; i++){
			int s = i-(k);
			int oitem = arr[s];
			if(maxHeap.peek() == oitem) 
				maxHeap.poll();
			if(minHeap.peek() == oitem)
				minHeap.poll();
			
			int item = arr[i];
			if(maxHeap.peek() > item){
				maxHeap.offer(item);
			}else{
				minHeap.offer(item);
			}
			
			if(maxHeap.size() > minHeap.size()+1){
				minHeap.offer(maxHeap.poll());
			}else if(minHeap.size() > maxHeap.size()){
				maxHeap.offer(minHeap.poll());
			}
			
			if(k%2==0){
				list.add((maxHeap.peek() + minHeap.peek())/2);
			}else{
				list.add(maxHeap.peek());
			}
		}
		return list;
	}
}
