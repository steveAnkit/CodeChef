package com.practice.factorial;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long lines = scanner.nextLong();
		for (int i = 0; i < lines; i++) {
			long num = scanner.nextLong();
			System.out.println(getTrailingZeros(num));
		}
	  
	    }
	
	
	// returns number of trailing zeros in any fractorial
	public static long getTrailingZeros(long number){
		
		long count = 0;
		
		for (int i = 5; number/i >=1; i = i*5) {
			  count  = count + number/i;
		}
		
		return count;
		
	}
	
}
