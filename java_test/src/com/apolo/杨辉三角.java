package com.apolo;

public class Ñî»ÔÈý½Ç {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int triangle[][] = new int[8][];
		for(int i = 0; i < triangle.length; i++){
			triangle[i] = new int[i+1];
			for(int j = 0; j < triangle[i].length-1; j++){
				if( j == 0 || i == j){
					triangle[i][j] = 1;
				}else{
					triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
				}
				System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
