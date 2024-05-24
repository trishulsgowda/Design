package com.backtracking;

public class WordSearch {

	public static void main(String[] args) {
		//char[][] board = {{'h','e','c','m','l'},{'w','l','i','e','u'},{'a','r','r','s','n'},{'s','i','i','o','r'}};
		//char[][] board = {{'c','s','s','a','m'},{'o','i','l','l','o'},{'o','l','i','t','o'},{'r','t','a','s','n'},{'s','i','t','a','c'}};
		
		char[][] board = {{'h'}};
		String word = "h";
		
		System.out.println(wordSearch(board, word));
		
	}
	
	public static boolean wordSearch(char[][] grid, String word) {

		int sr =0;
		int sc=0;
		int rLength = grid.length;
		int cLength = grid[0].length;
        
		for(int i=0; i<rLength; i++){
			for(int j=0; j<cLength; j++){
				if(grid[i][j] == word.charAt(0)){
					
					if(word.length() == 1) return true;
					
					sr =i; sc=j;
					if(find(grid, sr,sc, word, 1)) return true;
				}
			}
		}
        return  false;
    }

	private static boolean find(char[][] grid, int sr, int sc, String word, int i) {
		
		boolean found = false;
		int[][] adjacentCells = {{0,1},{1,0},{-1,0},{0,-1}};
		
		for(int[] cell : adjacentCells){
			int r = sr + cell[0];
			int c = sc + cell[1];
			
			if(r >= 0 && r<grid.length && c>=0 && c<grid[0].length){
				if(word.charAt(i) == grid[r][c]){
					if(i == word.length()-1) return true;
					return find(grid, r, c, word, ++i);
				}
			}
		}
		
		
		return false;
	}
}
