package com.challenge.Lunchtime;

import java.io.IOException;
import java.util.Scanner;

public class Collision {

	public static void main(String[] args) throws NumberFormatException, IOException {
	   
	    	Scanner sc=new Scanner(System.in);
	    	int T=sc.nextInt();
	    	while(T>0){
	    		int N=sc.nextInt();
	    		int M=sc.nextInt();
	    		String A[]=new String[N];
	    		for(int i=0;i<N;i++){
	    			A[i]=sc.next();
	    		}
	    		int sum=0;
	    		for(int i=0;i<M;i++){
	    			int cnt=0;
	    			for(int j=0;j<N;j++){
	    				if(A[j].charAt(i)=='1'){
	    					cnt++;
	    				}
	    			}
	    			int ans=(cnt*(cnt-1))/2;
	    			sum=sum+ans;
	    		}
	    		System.out.println(sum);
	    		T--;
	    	}
	    }
	    } 
	

