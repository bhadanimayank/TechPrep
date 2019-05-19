package com.practice.ds.algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayrotateleft {

	
	   static int[] rotLeft(int[] a, int d) {
           
           Integer[] array = Arrays.stream( a ).boxed().toArray( Integer[]::new );

           Collections.rotate(Arrays.asList(array), -d); 

           return Arrays.asList(array).stream()
                                      .mapToInt(Integer::intValue)
                                      .toArray();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Let us create an array of integers 
        int arr[] = {10, 20, 30, 40, 50}; 
   
                
           
        System.out.println("Modified Array : " + Arrays.toString(rotLeft(arr, 2)));
                     
	
	}

}
