package com.practice.CountingSort;

import java.util.Scanner;

public class CountingSort {

	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);
		}
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 
		 int lines = scanner.nextInt();
		 
		 int[] inputArray = new int[lines];
		 int[] resultArray = new int[lines];
		 
		 int max = 1;
		 for (int i = 0; i < lines; i++) {
		     inputArray[i] = scanner.nextInt();
		     if(inputArray[i] > max)
		    	 max = inputArray[i];
		 }
		 
		 int[] c = new int[max + 1];
		 
		 for (int i = 0; i < inputArray.length; i++) {
			
		   	c[inputArray[i]] = c[inputArray[i]] + 1;
     	 }
		 
		 int[] d = new int[max + 1];
		 
		 d[0] = c[0];
		 for (int i = 1; i < d.length; i++) {
			d[i] = d[i - 1] + c[i];
		 }
		 
		 for (int i = resultArray.length - 1; i >= 0  ; i--) {
		       resultArray[d[inputArray[i]]- 1] = inputArray[i];
		       d[inputArray[i]]--;
		}
		 
        
		 printArray(resultArray);
		
		
	}

}
