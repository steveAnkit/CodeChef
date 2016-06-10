package com.practice.smallfactorials;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long lines = scanner.nextLong();
		for (int i = 0; i < lines; i++) {
			long num = scanner.nextLong();
		     getFact(num);
			
		}

	}
	
	// handles big number
	public static void getFact(long num){
		BigInteger fac = BigInteger.valueOf(1);
		for (int i = 2; i <= num; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fac);
	}

}
