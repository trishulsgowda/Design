package com.dp;

public class FindUniquePathsDP {

	public static int findUniquePath(int[][] matrix) {
        
		boolean unreachableCol = false;
		for(int j=0 ; j< matrix[0].length; j++){
			
			if(unreachableCol) matrix[0][j] = 0;
			
			else if(matrix[0][j] == 1){
				matrix[0][j] = 0;
				unreachableCol = true;
			}else{
				matrix[0][j] =1;
			}
				
		}
		
		boolean unreachableRow = false;
		for(int i=1 ; i< matrix.length; i++){
			
			if(unreachableRow) matrix[i][0] = 0;
			
			else if (matrix[i][0] == 1){
				matrix[i][0] = 0;
				unreachableRow = true;
			}else{
				matrix[i][0] =1;
			}
		}
		
		for(int i=1; i< matrix.length; i++){
			for(int j=1 ; j< matrix[0].length; j++) {
				if(matrix[i][j] == 1){
					matrix[i][j] =0;
				}else{
					matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
				}
			}
		}

		return matrix[matrix.length-1][matrix[0].length-1];
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		matrix[1][0] = 1;
		matrix[1][3] = 1;
		
		matrix[2][0] = 1;
		matrix[3][1] = 1;
		
		System.out.println(findUniquePath(matrix));
	}
}
