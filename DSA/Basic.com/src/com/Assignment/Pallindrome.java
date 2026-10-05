package com.Assignment;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word :");
		String word=sc.nextLine();
		String temp=word;
		String newword="";
		for(int i=temp.length()-1;i>=0;i--) {
			newword=newword+temp.charAt(i);
		}
		if(newword.equals(word)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not a Pallindrome");
		}
	}
}
