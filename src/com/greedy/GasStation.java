package com.greedy;

import java.util.Arrays;

public class GasStation {

	public static int gasStationJourney(int[] gas, int[] cost) {
	  
		if(Arrays.stream(gas).sum() < Arrays.stream(cost).sum())
			return -1;
		
		for(int i=0 ; i<gas.length;){
			if(gas[i] < cost[i]){
				i++;
				continue;
			}
			
			int start = i;
			int j =i;
			int cg =0;
			
			do{
				cg = cg + gas[j%gas.length] - cost[j%gas.length];
				if(cg >0){
					j++;
				}else if(cg < 0){
					break;
				}
				
				if(j%gas.length == start-1 && cg>=0){
					return start;
				}
			}while(start != j%gas.length);
			i++;
		}
	      

	      return -1;
	}
	
	public static void main(String[] args) {
		int[] gas = {1,2,3,3};
		int[] cost = {2,1,5,1};
		
		//int[] gas = {1,2,3,4,5};
		//int[] cost = {3,4,5,1,2};
		
		System.out.println(gasStationJourney(gas, cost));
	}
	
}
