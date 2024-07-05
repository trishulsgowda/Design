package com.bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottingOranges {

	public static void main(String[] args) {
	
		/*int[][] mat = new int[3][3];
		mat[0][0] = 1;
		mat[0][1] = 1;
		mat[0][2] = 1;
		mat[1][1] = 1;
		mat[1][2] = 1;
		mat[2][0] = 2;
		mat[2][2] = 2;*/
		
		/*int[][] mat = new int[3][5];
		mat[0][0] = 2;
		mat[0][1] = 1;
		mat[0][3] = 2;
		mat[0][4] = 1;
		mat[1][0] = 1;
		mat[1][2] = 1;
		mat[1][3] = 2;
		mat[1][4] = 1;
		mat[2][0] = 1;
		mat[2][3] = 2;
		mat[2][4] = 1;*/
		
		int[][] mat = {{0,1,1},{1,0,1},{0,1,1}};
		
		System.out.println(rotOranges(mat));
	}

	private static int rotOranges(int[][] mat) {

		Queue<List<Integer>> q = new LinkedList<List<Integer>>();
		int noOfDays =0;
		
		for(int i =0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				if(mat[i][j]==2){
					List<Integer> list = new LinkedList<>();
					list.add(i); list.add(j);
					q.add(list);
				}
			}
		}
		
		List<Integer> lista = new LinkedList<>();
		lista.add(999); lista.add(999);
		q.add(lista);
		
		
		while(!q.isEmpty()){
			List<Integer> list = q.poll();
			int i = list.get(0);
			int j = list.get(1);
			
			if(i == 999 && j == 999){
				if(!q.isEmpty()){
					List<Integer> list5 = new LinkedList<>();
					list5.add(999); list5.add(999);
					q.add(list5);
					noOfDays = 1 + noOfDays;
					continue;
				}else{
					break;
				}
			}
			
			if(i-1 >= 0){
				if(mat[i-1][j] == 1){
					mat[i-1][j] =2;
					List<Integer> list1 = new LinkedList<>();
					list1.add(i-1); list1.add(j);
					q.add(list1);
				}
			}
			
			if(i+1 < mat.length){
				if(mat[i+1][j] == 1){
					mat[i+1][j] =2;
					List<Integer> list2 = new LinkedList<>();
					list2.add(i+1); list2.add(j);
					q.add(list2);
				}
			}
			
			if(j-1 >=0){
				if(mat[i][j-1] == 1){
					mat[i][j-1] = 2;
					List<Integer> list3 = new LinkedList<>();
					list3.add(i); list3.add(j-1);
					q.add(list3);
				}
			}
			
			if(j+1 < mat[0].length){
				if(mat[i][j+1] == 1){
					mat[i][j+1] = 2;
					List<Integer> list4 = new LinkedList<>();
					list4.add(i); list4.add(j+1);
					q.add(list4);
				}
			}
		}
		
		for(int i=0; i<mat.length; i++){
			for(int j=0 ;j<mat[0].length; j++){
				if(mat[i][j]==1) return -1;
			}
		}
		
		return noOfDays;
	}
}
