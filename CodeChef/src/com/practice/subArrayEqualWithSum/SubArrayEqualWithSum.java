package com.practice.subArrayEqualWithSum;

public class SubArrayEqualWithSum {

	public static void main(String[] args) {
       int[] array = {2,8,1,3,9};
       int sum = 4;
       int size = array.length;
       
       getSubArray(array, sum, size);
       
	}
	
	public static void getSubArray(int[] array,int sum ,int n){
		
		int tempSum = array[0];
		int start = 0;
		
		for (int i = 1; i < array.length; i++) {
			
			while((tempSum > sum) &&  start < i -1  ){
				tempSum = tempSum - array[start];
				start++;
			}
			
			
			if(i < n)
				tempSum = tempSum + array[i];
			
			
			if(tempSum == sum){
				System.out.println("MATCH FOUND BETWEEN");
				break;
			}
				
			
		}
		
	}

}
