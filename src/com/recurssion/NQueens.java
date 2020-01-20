package com.test;

import java.util.Arrays;

public class NQueens
{
	static int positions[] = new int[4];
	
	public static void main(String[] args)
	{
		int n = 4;
		int res[] = new int[n];
		
		for(int i=0; i<n; i++){
			res[i] = Integer.MIN_VALUE;
		}
		
		place(0,res,n);
		
	}

	private static void place(int i, int[] res,int n)
	{
		if(i >= n){
			Arrays.stream(res).forEach(System.out::print);
			System.out.println("************");
			return;
		}
		
		for(int j =0 ; j < n; j++)
		{
			if(!isAttacked(i,j,res)){
				res[i] = j;
				int next = i +1;
				place(next,res,n);
			}
			res[i] = Integer.MIN_VALUE;
		}
	}

	private static boolean isAttacked(int i, int j, int[] res)
	{
		if(Arrays.stream(res).anyMatch(n -> n==j)) return true;
		if(isAttackedDiagonally(res,i-j,false) || isAttackedDiagonally(res,i+j,true)) return true;
		return false;
	}

	private static boolean isAttackedDiagonally(int[] res, int i, boolean fromRightCorner)
	{
		for(int k=0; k < res.length ; k++){
			if(res[k] >=0){
				int num;
				if(fromRightCorner)
					num = k + res[k];
				else 
					num = k - res[k];
				
				if(num == i) return true;
			}
		}
		return false;
	}
}
