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
				System.out.println("length "+(j-rotations));
				
				if((j-rotations)<0) {
					System.out.println("0000 "+(arr.length+(j-rotations)));
					processed[arr.length+(j-rotations)]=arr[j];
				}
				else {
					System.out.println("Here "+(j-rotations)+" "+arr[j]);
					processed[j-rotations]=arr[j];
				}
					
				
			}
		
		
		for (int k = 0; k < processed.length; k++) {
			System.out.print(processed[k]);
		}
		
	} 

}
