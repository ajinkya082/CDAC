package com.basic;
import java.util.Scanner;

public class Addition_of_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		if(a%2==0) {
			System.out.println(a+" is even");
		}
		else {
			System.out.println(a+ " is odd");
		}
		System.out.println(a+"+"+b+"=" + (a+b));
		sc.close();		
	}
}
