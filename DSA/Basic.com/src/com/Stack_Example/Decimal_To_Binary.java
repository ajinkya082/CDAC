package com.Stack_Example;
import java.util.Stack;
import java.util.Scanner;

public class Decimal_To_Binary {
	static int dec_to_binary(int decimal) {
		int binary = 0;
		Stack<Integer>s=new Stack<>();
		
		while(decimal>0) {
//			int rem=decimal%2; //this one also correct but increase more variable
			s.push(decimal%2);
			decimal=decimal/2;
		}
		while(!s.isEmpty()) {
			binary=binary*10+s.pop();
		}
		return binary;
	}
	
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);

	        int decimal;

	        System.out.println("Enter number:");
	        decimal = sc.nextInt();

	        System.out.print("\nDecimal to Binary is:" + dec_to_binary(decimal));
	        
	        sc.close();
	}
}
