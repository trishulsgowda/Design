package com.dp;

public class HouseThiefDP {

	public static int houseThief(int[] money) {
		
		if(money.length == 0) return 0;
		
		int[] dp = new int[money.length+1];
		dp[0]=0;
		
		
		for(int i=1; i< dp.length; i++){
			if(i-2 >=0){
				dp[i] = Math.max(dp[i-1], money[i-1] + dp[i-2]);
			}else{
				dp[i] = Math.max(dp[i-1], money[i-1]);
			}
		}
		
		
		return dp[money.length];
	}
	
	public static void main(String[] args) {
//		int[] money = {10,20,30,80};
		int[] money = {1,2,3,1};
		System.out.println(houseThief(money));
	}
}
