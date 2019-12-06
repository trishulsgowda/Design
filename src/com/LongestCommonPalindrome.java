package com.dp;

public class LongestCommonPalindrome
{
	public static void main(String[] args)
	{
		String str = "adbbca";
		Integer dp[][] = new Integer[str.length()][str.length()];
		
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<str.length(); j++){
				if(i==j){
					dp[i][j] = 1;
				}else{
					dp[i][j] = 0;
				}
			}
		}
		
		func(dp,0,1,str);
		
		for(int i=0 ; i<str.length(); i++){
			for(int j=0; j<str.length(); j++){
				System.out.print(dp[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	private static void func(Integer[][] dp, int i, int j, String str)
	{
		int col = j;
		if(i==j && i==str.length()-1) return;

		while(j<str.length()){
			if(str.charAt(i)==str.charAt(j)) 
				dp[i][j] = 2 + dp[i+1][j-1];
			else 
				dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
				
			i++; j++;
		}
		func(dp,0,col++,str);
	}

}
