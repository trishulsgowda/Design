package com.dp;

public class LongestCommonSubsequence {

	public static int longestCommonSubsequence(String str1, String str2) {
        
		int[][] dp = new int[str1.length()+1][str2.length()+1];
		
		for(int i=1; i<=str1.length(); i++){
			for(int j=1; j<=str2.length(); j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				}else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		return dp[str1.length()][str2.length()];
    }
	
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "apple";
		
		System.out.println(longestCommonSubsequence(str1, str2));
	}
}
