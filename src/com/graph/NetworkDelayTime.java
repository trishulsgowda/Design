package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class NetworkDelayTime {

	public static void main(String[] args) {
		 int[][] times = { {2, 1, 1}, {3, 2, 1}, {3, 4, 2} };
		 int n=4;
		 int k=3;
		 
		 System.out.println(networkDelayTime(times, n, k));
	}
	
	public static int networkDelayTime(int[][] times, int n, int k) {
		Map<Integer, List<int[]>> map = new HashMap<>();
		for(int[] t: times){
			map.putIfAbsent(t[0], new ArrayList<>());
			map.get(t[0]).add(new int[] {t[1],t[2]});
		}
		
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
		pq.add(new int[]{0,k});
		
		Set<Integer> visited = new HashSet<>();
		int delay =0;
		
		while(!pq.isEmpty()){
			int[] t = pq.poll();
			int node = t[1];
			int time = t[0];
			
			if(visited.contains(node))
				continue;
				
			if(map.containsKey(node)){
				for(int[] neighbors: map.get(node)){
					
					if(!visited.contains(neighbors[0])){
						pq.offer(new int[]{neighbors[1] + time, neighbors[0]});
					}
				}
			}
			visited.add(node);
			
			
			delay = Math.max(delay, time);
		}
		
		if(visited.size() == n) 
			return delay;
		
		return -1;
	}
}
