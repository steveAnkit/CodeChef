package com.practice.candyDistribution;

import java.util.Scanner;

public class CandyDistribution {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
	    
		//rating array
	    int[] rating = new int[lines];
	    int[] result = new int[lines];
	    
	    
	    for (int i = 0; i < lines; i++) {
			rating[i] = scanner.nextInt(); 
		}
        
	    
	    // assign min. candies to evryone
	    for (int i = 0; i < rating.length; i++) {
			result[i] = 1;
		}
	    
	    for (int i = 1; i < result.length; i++) {
			if(rating[i] > rating[i -1]){
				result[i] = result[i-1] + 1;
			}
		}

	    for (int i = result.length - 1; i > 0; i--) {
			if(rating[i -1] > rating[i]){
				result[i - 1] = Math.max(result[i] + 1, result[i - 1]); 
			}
	    	
		}
	    
	    long sum =0;
	    for (int i = 0; i < result.length; i++) {
			sum  = sum + result[i];
		}
	    
	    System.out.println(sum);
	    
	    
	    
	    

	}
	
	
	
}
