package com.practice.atm;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	    double x=scanner.nextDouble();
	    double y=scanner.nextDouble();
	    if((x>0&&x<=2000)&&(y>=0&&y<=2000))
	    {
	    if((x<=(y-0.5))&&(x%5==0))
	    y=y-x-0.5;
	    System.out.printf("%.2f\n",y);
	    }
	    }
		
		
	}
	

