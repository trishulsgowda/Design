package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {

	public static void main(String[] args) {
		int a[][] = {{1,0,0,0},{1,1,0,0},{1,1,0,0},{0,1,1,1}};
		int vis[][] = new int[a.length][a[0].length];
		List<String> res = new ArrayList<>();
		
		solve(0,0,a.length,a[0].length,a,"",res, vis);
		
		res.stream().forEach(n -> System.out.println(n));
	}

	private static void solve(int i, int j, int rl, int cl, int[][] a, String ans, List<String> res, int[][] vis) {
		if(i == rl-1 && j == cl-1){
			res.add(ans);
			return;
		}
		
		if(i+1<rl && a[i+1][j] ==1 && vis[i+1][j] ==0){
			vis[i][j] = 1;
			solve(i+1, j, rl, cl, a, ans + "D", res, vis);
			vis[i][j] = 0;
		}
		
		if(j-1>=0 && a[i][j-1] ==1 && vis[i][j-1] ==0){
			vis[i][j] = 1;
			solve(i, j-1, rl, cl, a, ans + "L", res, vis);
			vis[i][j] = 0;
		}
		
		if(j+1<cl && a[i][j+1] ==1 && vis[i][j+1] ==0){
			vis[i][j] = 1;
			solve(i, j+1, rl, cl, a, ans + "R", res, vis);
			vis[i][j] = 0;
		}
		
		if(i-1>=0 && a[i-1][j] ==1 && vis[i-1][j] ==0){
			vis[i][j] = 1;
			solve(i-1, j, rl, cl, a, ans + "U", res, vis);
			vis[i][j] = 0;
		}
		
	}
}
