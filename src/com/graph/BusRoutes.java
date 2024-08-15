package com.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class BusRoutes {

	public static void main(String[] args) {
		int[][] routes = {{2, 5, 7}, {4, 6, 7}};
		int src = 7;
		int dest = 6;
		
		System.out.println(minimumBuses(routes, src, dest));
	}
	
	public static int minimumBuses(int[][] routes, int src, int dest) {
		
		Map<Integer, Set<Integer>> aMap = new HashMap<>();
		for(int i=0 ;i<routes.length; i++){
			int[] route = routes[i];
			for(int station : route){
				aMap.putIfAbsent(station, new HashSet<>());
				aMap.get(station).add(i);
			}
		}
		
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{src,0});
		
		Set<Integer> visitedBuses = new HashSet<>();
		int busCount =0;
		
		while(!queue.isEmpty()){
			int[] s = queue.poll();
			int station = s[0];
			busCount = s[1];
			
			if(station == dest) return busCount;
			
			Set<Integer> buses = aMap.get(station);
			
			for(int bus : buses){
				if(!visitedBuses.contains(bus)){
					
					for(Map.Entry<Integer, Set<Integer>> entry : aMap.entrySet()){
						if(entry.getValue().contains(bus)){
							queue.add(new int[]{entry.getKey(), busCount + 1});
						}
					}
					visitedBuses.add(bus);
				}
			}
		}
		
		return busCount;
	}
}
