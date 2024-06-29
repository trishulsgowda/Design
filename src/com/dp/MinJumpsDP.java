package com.dp;

public class MinJumpsDP {

	public static long findMinJumps(int[] nums) {
		
		int[] dp = new int[nums.length];
		
		dp[0] = 0;
		for(int k=1; k<dp.length; k++){
			dp[k] = Integer.MAX_VALUE;
		}
		
		for(int i=1; i< dp.length; i++){
			for(int j=i; j>0; j--){
				if(nums[i-j] + (i-j) >= i){
					dp[i] = Math.min(dp[i], dp[i-j] + 1);
				}
			}
		}
		
		return dp[nums.length-1];
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,5,7};
		System.out.println(findMinJumps(nums));
	}

}
