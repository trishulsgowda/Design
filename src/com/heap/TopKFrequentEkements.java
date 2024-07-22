package com.heap;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class TopKFrequentEkements {

	public static void main(String[] args) {
		int[] arr = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
		int k=10;
		
		List<Integer> topKFrequent = topKFrequent(arr,k);
	}

	private static List<Integer> topKFrequent(int[] arr, int k) {
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		for(Integer i: arr){
			int count = freqMap.getOrDefault(i, 0) + 1;
			freqMap.put(i, count);
		}
		
		// Min heap - sorted in ascending order
		PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((e1,e2) -> e1.getValue() - e2.getValue());
		
		for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
			q.offer(entry);
			if(q.size() > k){
				q.poll();
			}
		}
		
		return q.stream().map(e -> e.getKey()).collect(Collectors.toList());
	}
}
