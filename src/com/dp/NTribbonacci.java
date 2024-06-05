package com.dp;

public class NTribbonacci {

	public static void main(String[] args) {
		int n=5;
		
		System.out.println(findTribbonacci(n));
	}

	private static int findTribbonacci(int n) {
		
		if(n==0) return 0;
		else if(n==1 || n==2) return 1;
		
		int firstNum=0, secondNumber=1, thirdNumber=1;
		
		for(int i=3 ; i<=n; i++){
			int nextNum = firstNum + secondNumber + thirdNumber;
			firstNum = secondNumber;
			secondNumber = thirdNumber;
			thirdNumber = nextNum;
		}
		
		return thirdNumber;
	}
}
