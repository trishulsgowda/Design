package com.dp;

import java.util.ArrayList;
import java.util.List;

public class FindUniquePaths {

	public static int findUniquePath(int[][] matrix) {
        
		List<Integer> list = new ArrayList<>();
		findUniquePath(0,0, list, matrix);
        return list.size();
	}

	private static void findUniquePath(int i, int j, List<Integer> list, int[][] matrix) {
		
		if(i >= matrix.length) return;
		
		if(j >= matrix[0].length) return;
		
		if( i == matrix.length-1 && j == matrix[0].length-1 && matrix[i][j] == 0){
			list.add(1);
			return;
		}
		
		if(matrix[i][j] == 1)
			return;
		
		findUniquePath(i, j+1, list, matrix);
		findUniquePath(i+1, j, list, matrix);
	}
}
