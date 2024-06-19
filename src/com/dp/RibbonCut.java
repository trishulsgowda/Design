package com.dp;

import java.util.Arrays;

public class RibbonCut {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 7 };
		int total = 13;
		
		System.out.println(countRibbonPieces(total,arr));
	}

	public static int countRibbonPieces(int n, int[] sizes) {
		
		int[] dp = new int[n+1];
		
		for(int i=0; i< dp.length; i++){
			dp[i] = -1;
		}
		
		dp[0] = 0;
		
		for(int i=1; i<dp.length; i++){
			for(int c=0; c<sizes.length; c++){
				
				if(i - sizes[c] >=0 && i - sizes[c] != -1)
				dp[i] = Math.max(dp[i], dp[i- sizes[c]] + 1); // For given size if the specified size is cut => The remaining size is => i - sizes[c]
				// No of ways remaining size can be formed => dp[i- sizes[c]] 
				// for given size 9 -> if we cut 3 -> we get 6
				// No of ways 6 can be formed is 2
				// So, No of ways 9 can be formed is 2 + 1
			}
		}
		
		print(dp);
		
		return dp[dp.length-1];
	}

	private static void print(int[] dp) {
		
		Arrays.stream(dp).forEach(i -> System.out.print(i + " "));
	}
}
