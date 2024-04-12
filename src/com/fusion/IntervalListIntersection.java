package com.fusion;

import java.util.ArrayList;
import java.util.Arrays;

public class IntervalListIntersection {

	public static int[][] intervalsIntersection(int[][] intervalLista, int[][] intervalListb) {
        
		int i=0,j=0;
		ArrayList<int[]> output = new ArrayList<>();
		
		while(i < intervalLista.length && j < intervalListb.length){
			
			int aStart = intervalLista[i][0];
			int aEnd = intervalLista[i][1];
			
			int bStart = intervalListb[j][0];
			int bEnd = intervalListb[j][1];
			
			int intersectionStart = Math.max(aStart, bStart);
			int intersectionEnd = Math.min(aEnd, bEnd);
			
			if(intersectionStart <= intersectionEnd){
				int[] intersection = {intersectionStart,intersectionEnd};
				output.add(intersection);
			}
			
			if(aEnd < bEnd) i++;
			else j++;
		}
		
		System.out.println(Arrays.deepToString(output.toArray()));
		
		
        return output.toArray(new int[0][0]);
    }
	
	public static void main(String[] args) {
		
		int[][] intervalLista = {{2,6}, {7,9}, {10,13}, {14,19}, {20,24}};
		int[][] intervalListb = {{1,4},{6,8}, {15,18}};
		
		intervalsIntersection(intervalLista, intervalListb);
	}
}
