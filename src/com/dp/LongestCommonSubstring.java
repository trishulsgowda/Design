package com.dp;

public class LongestCommonSubstring {

	public static int lcsLength (String input1, String input2) {
        
		
		int[][] dp = new int[input1.length()+1][input2.length()+1];
		int maxLength =0;
		
		for(int i=1; i<= input1.length(); i++){
			for(int j=1 ; j<= input2.length(); j++){
				
				if(input1.charAt(i-1) == input2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
					maxLength = Math.max(maxLength, dp[i][j]);
				}else{
					dp[i][j] = 0;
				}
			}
		}
        return maxLength;
    }
	
	public static void main(String[] args) {
		String s1 = "katty";
		String s2 = "catty";
		
		System.out.println(lcsLength(s1, s2));;
	}
}
