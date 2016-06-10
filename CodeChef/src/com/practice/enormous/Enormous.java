package com.practice.enormous;

import java.util.Scanner;

public class Enormous {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	    long lines = scanner.nextInt();
	    long number = scanner.nextLong();
	    long count = 0;
	    
	    for (int i = 0; i < lines; i++) {
			long num = scanner.nextLong();
			if(num % number == 0){
				count++;
			}
		}
	    System.out.println(count);
	    
	}
}
