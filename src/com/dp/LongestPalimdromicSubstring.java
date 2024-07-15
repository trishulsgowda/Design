package com.dp;

public class LongestPalimdromicSubstring {

	public static void main(String[] args) {
		
		String str = "yxyzyxy";
		int lps = longestPalidromicSubstring(str);
		System.out.println(lps);
	}

	private static int longestPalidromicSubstring(String str) {
		
		int[][] dp = new int[str.length()][str.length()];
		
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<str.length(); j++){
				if(i == j) dp[i][j] =1;
			}
		}
		
		for(int start = str.length()-2; start>=0; start--){
			for(int end = start+1; end<str.length(); end++){
				if(str.charAt(start) == str.charAt(end))
					dp[start][end] = dp[start+1][end-1] + 2;
				else
					dp[start][end] = Math.max(dp[start+1][end], dp[start][end-1]);
			}
		}
		
		return dp[0][str.length()-1];
	}
}
