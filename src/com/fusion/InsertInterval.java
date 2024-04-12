package com.fusion;

public class InsertInterval {

	 public static void insertInterval(int[][] existingIntervals, int[] newInterval) {
		 
		int newStart = newInterval[0];
		int newEnd = newInterval[1];
		
		int[][] output = new int[existingIntervals.length][2];
		
		// For each existing interval, compare with the new start time
		// If the existing interval is starting before new start time then add it to output list
		
		int i=0;
		int n=existingIntervals.length;
		
	 }
	 
	 public static void main(String[] args) {
		 int[] newInterval =  {5, 7};
		 
		 int[][] existingIntervals = {{1, 2}, {3, 5}, {6, 8}}; 
	     
		 insertInterval(existingIntervals, newInterval);
	}
}
