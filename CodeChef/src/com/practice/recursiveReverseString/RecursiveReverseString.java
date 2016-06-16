package com.practice.recursiveReverseString;

public class RecursiveReverseString {

	
	static String subProblem = "";
	static String subSolution = "";
	static String solution = "";
	
	public static void main(String[] args) {
		
		System.out.println(revrse("ankit")); 

	}
	
	
	public static String revrse(String word) {
		if(word.length() <=0 )
			return word;
		else{
			  subProblem = word.substring(1);
			  subSolution = revrse(subProblem);
			  solution = subSolution + word.charAt(0);
			  return solution;
		}
	}

}
