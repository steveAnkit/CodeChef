package com.practice.packagingCupcakes;

import java.util.Scanner;

public class PackagingCupcakes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		
		for (int i = 0; i < lines; i++) {
			int num = scanner.nextInt();
			System.out.println((num/2)+ 1);
		}

	}

}
