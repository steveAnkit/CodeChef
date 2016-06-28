package com.practice.PostfixExpressionEaluation;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpressionEaluation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for (int i = 0; i < T; i++) {
			String str = scanner.next();
            String result = new String();
			Stack<Character> stack = new Stack<Character>();
			for (int j = 0; j < str.length(); j++) {
				boolean flag = false;
				char c = str.charAt(j);
				switch (c) {
				case '*':
					stack.push(c);
					flag = true;
					break;
				case '+':
					stack.push(c);
					flag = true;
					break;
				case '-':
					stack.push(c);
					flag = true;
					break;
				case '/':
					stack.push(c);
					flag = true;
					break;
				case '^':
					stack.push(c);
					flag = true;
					break;
				case '(':
					stack.push(c);
					flag = true;
					break;
				}
				
				if(c == ')'){
					flag = true;
					while(true){
						char e =  stack.pop();
						if(e == '(')
							break;
						if(e != '(')
							result = result + e;
					}
				}
				
				if(!flag)
					result = result + c;
			}
			System.out.println(result);

		}

	}

}
