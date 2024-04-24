package com.fusion;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KSmallestNumber {

	public static int kSmallestNumber(List<List<Integer>> lists, int k) {
		
		PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
		
		for(int i=0; i < lists.size(); i++){
			if(lists.get(i).size() > 0){
				heap.add(new int[]{lists.get(i).get(0), i,0});
			}
		}
		
		int count=0; int smallestNumber=0;
		
		while(!heap.isEmpty()){
			int[] item = heap.poll();
			
			count++;
			
			smallestNumber = item[0];
			int listIndex = item[1];
			int position = item[2];
			
			if(count == k)
				break;
			
			if(position + 1 < lists.get(listIndex).size()){ // Avoids ArraysIndexOutOfBound
				heap.add(new int[]{lists.get(listIndex).get(position + 1), listIndex, position+1});
			}
			
		}
		
		
		return smallestNumber;
	}
	
	public static void main(String[] args) {
		List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(5, 8, 9, 17),
                Arrays.asList(),
                Arrays.asList(8, 17, 23, 24)
            );
		
		kSmallestNumber(lists, 4);
		
	}
}
