package com.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinRefuelingStops {

	public static void main(String[] args) {
		int[][] stations = {{2,5},{3,1},{6,4},{12,6}};
		int startFuel = 3;
		int target = 15;
		
		System.out.println(minRefuelStops(target, startFuel, stations));
	}
	
	public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        
		if(target <= startFuel) return 0;
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
		int maxRange = startFuel;
		int stops=0;
		int i=0;
		int n= stations.length;
		while(maxRange < target){
			if(i < n && maxRange >= stations[i][0]){
				maxHeap.add(stations[i][1]);
				i++;
			}else if(maxHeap.isEmpty()){
				return -1;
			}
			else{
				maxRange = maxRange + maxHeap.poll();
				stops++;
			}
		}
		
        return stops;
    }
}
