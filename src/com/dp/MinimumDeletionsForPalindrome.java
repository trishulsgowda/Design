package com.dp;

public class MinimumDeletionsForPalindrome {

	public static int minimumDeletions(String s) {

		StringBuilder sb = new StringBuilder(s);
		String sr = sb.reverse().toString();
		
		int[][] dp = new int[s.length()+1][sr.length()+1];
		
		for(int i=1; i<=s.length(); i++){
			for(int j=1; j<=sr.length(); j++){
				if(s.charAt(i-1) == sr.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				}else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
        
    
        return s.length() - dp[s.length()][sr.length()];
    }
	
	public static void main(String[] args) {
		String s = "level";
		
		int count = minimumDeletions(s);
		System.out.println(count);
	}
}
