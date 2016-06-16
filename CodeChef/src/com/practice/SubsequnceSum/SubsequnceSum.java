package com.practice.SubsequnceSum;


public class SubsequnceSum {
	
	public static void main(String[] args) {

		getSubsequnce(new int[]{1,8,3,7,9,2},10);
	}
	
	public static void getSubsequnce(int[] array, int sum){
		
		boolean[] bs = new boolean[256];
		
		for (int i = 0; i < array.length; i++) {
			bs[array[i]] = true;
		}
		
		for (int i = 0; i < array.length; i++) {
			if(bs[(sum - array[i])]){
				System.out.println("{"+array[i] +","+ (sum - array[i]) +"}");
				bs[(array[i])] = false;
			}
		}
		
		
	}

}
