package com.practice.theLeadGame;

import java.util.Scanner;

public class TheLeadGame {
	

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int[][] scores = new int[lines][2];
        for (int i = 0; i < scores.length; i++) {
		   for (int j = 0; j < 2; j++) {
			 scores[i][j] = scanner.nextInt(); 
		   }	
		}
        
        int max = 0;
        String tempWinnerName = null;
        String winnerName = null;
        int tempScore = 0;
        int cumulative_A_Sum = 0;
        int cumulative_B_Sum = 0;
        
        for (int i = 0; i < scores.length; i++) {
        	
        	 cumulative_A_Sum = cumulative_A_Sum + scores[i][0];
        	 cumulative_B_Sum = cumulative_B_Sum + scores[i][1];
        	
        	 int player_A_Score =  cumulative_A_Sum;
        	 int player_B_Score =  cumulative_B_Sum;
        	
        	 
        	 if(player_A_Score > player_B_Score){
        		 tempWinnerName = "1";
        		 tempScore  = player_A_Score - player_B_Score;
        	 }else{
        		 tempWinnerName = "2";
        		 tempScore = player_B_Score - player_A_Score;
        	 }
        	 if(tempScore > max){
        		 max = tempScore;
        		 winnerName = tempWinnerName;
        	 }
        	 
 		}
        
        System.out.println(winnerName  +" "+max);
        
        
	}

}
