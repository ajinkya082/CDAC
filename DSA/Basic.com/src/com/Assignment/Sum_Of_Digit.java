package com.Assignment;

import java.util.Scanner;

public class Sum_Of_Digit {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long number=sc.nextLong();
		long digit;
		long sum=0;

		while(number>0) {
			digit=number%10;
			sum=sum+digit;

			number=number/10;
		}
		System.out.println("Sum of digits=" + sum);
	}
}
