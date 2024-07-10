package com.dp;

public class InterleavingStrings {

	public static void main(String[] args) {
		String s1 = "xyz";
		String s2 = "abc";
		String s3 = "axbycz";
		System.out.println(interleavingStrings(s1,s2,s3));
	}

	private static boolean interleavingStrings(String s1, String s2, String s3) {
		
		boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
		dp[0][0] = true;
		
		for(int j=1; j<=s2.length(); j++){
			if(s2.charAt(j-1) == s3.charAt(j-1) && dp[0][j-1]==true){
				dp[0][j] = true;
			}
		}
		
		for(int i=1; i<=s1.length(); i++){
			if(s1.charAt(i-1) == s3.charAt(i-1) && dp[i-1][0]==true){
				dp[i][0] = true;
			}
		}
		
		for(int i=1; i<=s1.length(); i++){
			for(int j=1; j<=s2.length(); j++){
				if(s1.charAt(i-1) == s3.charAt(i+j-1) && dp[i-1][j] == true){
					dp[i][j] = true;
				}
				
				if(s2.charAt(j-1) == s3.charAt(i+j-1) && dp[i][j-1] == true){
					dp[i][j] = true;
				}
			}
		}
		
		print(dp);
		
		return dp[s1.length()][s2.length()];
	}
	
	private static void print(boolean[][] dp) {
		int rows = dp.length;
		int columns = dp[0].length;
		
		for(int i=0;i< rows; i++){
			for(int j=0 ; j< columns ; j++){
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}
}
