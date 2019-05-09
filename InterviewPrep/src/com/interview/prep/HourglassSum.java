package com.interview.prep;

public class HourglassSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[6][6];
		int i=0;
		for(int row=0;row<6;row++) {
			for(int column=0;column<6;column++) {
				matrix[row][column]=i;
				i++;
			}
		}
		System.out.println("Max Sum "+hourglassSum(matrix));
	}
	
	public static int hourglassSum(int[][] matrix) {
		
		int sum=0;
		for(int row=0; row<4; row++) {
			for(int column=0; column<4; column++) {
				int internalSum = matrix[row][column]+matrix[row][column+1]+matrix[row][column+2]
						         +matrix[row+1][column+1]+
						         matrix[row+2][column]+matrix[row+2][column+1]+matrix[row+2][column+2];
				if(sum<internalSum) {
					sum=internalSum;
				}
			}
		}
		return sum;
		
	}

}
