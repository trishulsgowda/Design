package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		int n=5;
		List<List<Integer>> placed = new ArrayList<>();
		
		placeQueen(placed,0,n);
		
		for(List<Integer> point: placed){
			System.out.println(point.get(0) + "," + point.get(1));
		}
		
	}

	private static void placeQueen(List<List<Integer>> placed, int row, int n) {
		
		for(int col=0; col<n; col++){
			
			if(safePlace(row,col,placed)){
				List<Integer> point = new ArrayList<>();
				point.add(row); point.add(col);
				placed.add(point);
				
				if(placed.size() == n) return;
				
				int nextRow = row +1;
				
				if(nextRow<n){
					placeQueen(placed, nextRow, n);
					if(placed.size() != n)
					placed.remove(placed.size()-1);
					
				}
				
				
				
			}
		}
	}

	private static boolean safePlace(int row, int col, List<List<Integer>> placed) {
		
		if(placed.isEmpty()) return true;
		
		for(List<Integer> place: placed){
			if(place.get(0) == row) return false;
			if(place.get(1) == col) return false;
			
			if(Math.abs(place.get(0) - row) == Math.abs(place.get(1) - col)) return false;
		}
		
		return true;
	}
}
