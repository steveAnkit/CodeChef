package com.practice.LECANDY;
import java.util.Scanner;

public class LECANDY {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int _testCases = scanner.nextInt();
		
		for(int i = 0 ; i < _testCases ; i++ )
		{
			int elephants = scanner.nextInt();
			long candies = scanner.nextLong();
			
			long min[] = new long[elephants];
			long sum = 0;
			for(int j=0 ; j < elephants ; j++)
			{
				min[j] = scanner.nextInt();
				sum = sum + min[j];			
			}
		
			if(sum <= candies)
			{
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
			
		}
		
		
	}

}
