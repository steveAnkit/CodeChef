package com.practice.NumberOfMenus;

import java.io.IOException;
import java.util.Scanner;

public class NumberOfMenus {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		for (int i = 0; i < cases; i++) {
           	int result = 0;
			int num = scanner.nextInt();
			for (int j = 11; j >= 0; j--) {
				
				while(num >= Math.pow(2, j)){
					num =  (num - (int)Math.pow(2, j));
					result = result + 1; 
				}
			}
			
			System.out.println(result);
			result = 0;
			
		}
		
		
	}

}
