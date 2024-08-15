package com.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PathsInMaze {

	public static void main(String[] args) {
		int[][] corridors =  {{1, 2}, {5, 2}, {4, 1}, {2, 4}, {3, 1}, {3, 4}};
		int n=5;
		
		System.out.println(numberOfPaths(corridors, n));
	}

	private static int numberOfPaths(int[][] corridors, int n) {
		
		Map<Integer, Set<Integer>> neighbors = new HashMap<>();
		int cycle =0;
		
		for(int[] corridor: corridors ){
			int room1 = corridor[0];
			int room2 = corridor[1];
			
			neighbors.putIfAbsent(room1, new HashSet<>());
			neighbors.putIfAbsent(room2, new HashSet<>());
			neighbors.get(room1).add(room2);
			neighbors.get(room2).add(room1);
			
			cycle = cycle + intersection(neighbors.get(room1), neighbors.get(room2));
		}
		
		return cycle;
	}

	private static int intersection(Set<Integer> set, Set<Integer> set2) {
		int count =0;
		
		for(int item : set){
			if(set2.contains(item)) count++;
		}
		return count;
	}
}
