package com.practice.SubsequnceSum;


public class SubsequnceSum {
	
	public static void main(String[] args) {

		getSubsequnce(new int[]{1,8,3,7,9,2},10);
	}
	
	public static void getSubsequnce(int[] array, int sum){
		
		//initialize an array of boolean
		boolean[] bs = new boolean[256];
		
		//make all indexs true which ar present in given array
		for (int i = 0; i < array.length; i++) {
			bs[array[i]] = true;
		}
		
		// iterate over array 
		for (int i = 0; i < array.length; i++) {
			
			/*
			 * apply simple maths like:
			 * if a + b = sum 
			 * then
			 * sum - b = a
			 */
			if(bs[(sum - array[i])]){
				System.out.println("{"+array[i] +","+ (sum - array[i]) +"}");
				
				/* For avoiding duplicate sub sets like
				 * {1,8} and {8,1}
				 */
				bs[(array[i])] = false;
			}
		}
		
		
	}

}
