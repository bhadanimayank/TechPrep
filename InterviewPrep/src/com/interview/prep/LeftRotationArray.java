package com.interview.prep;

public class LeftRotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,6};
		int rotations=2;
		rotateLeft(arr, rotations);
	}
	
	public static void rotateLeft(int[] arr, int rotations) {
		int[] processed = arr.clone();
				
			for(int j=0;j<arr.length;j++) {
				if((j-rotations)<0) {
					processed[arr.length+(j-rotations)]=arr[j];
				}
				else {
					processed[j-rotations]=arr[j];
				}
			}

		
	} 

}
