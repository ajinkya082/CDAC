package com.Assignment;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Binary_To_Decimal {
	
	public static long binToDec(String s) {
		Queue<Integer> q=new ArrayDeque<>();
		for(int i=0;i<s.length();i++) {
			q.offer(s.charAt(i)-'0');
		}
		int digit,result=0;
		while(!q.isEmpty()) {
			digit=q.poll();
			result=result*2+digit;
		}
		return result;
	}

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter binary digit:");
			String s=sc.next();
			
			System.out.println("The binary to decimal is:"+binToDec(s));
		
	}
}
