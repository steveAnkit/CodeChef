package com.practice.sumsInATriangle;

import java.util.Scanner;

public class SumsInATriangle {

	public static void printArray(int[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" " +arr[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfArrays = scanner.nextInt();
		for (int i = 0; i < numberOfArrays; i++) {
			int lines = scanner.nextInt();
			int[][] array = new int[lines][lines]; 
			for (int j = 0; j < lines; j++) {
			    	for (int j2 = 0; j2 <= j ; j2++) {
						array[j][j2] = scanner.nextInt();
					}
			}
			printArray(array);	
			System.out.println();
			System.out.println(getSum(array, 0 , 0, lines));
		}
	}
	
	public static int getSum(int[][] array,int i ,int j, int n) {
		if(i > n-1)
			return 0;
		else{
		  return Math.max((array[i][j] + getSum(array, i + 1, j, n)),(array[i][j] + getSum(array, i + 1, j + 1, n)));
		}
	
	}
	

}
