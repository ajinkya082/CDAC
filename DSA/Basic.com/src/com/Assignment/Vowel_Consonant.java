package com.Assignment;

import java.util.Scanner;

public class Vowel_Consonant {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String line=sc.nextLine();
		int vowels=0;
		int consonant=0;
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)=='A' || line.charAt(i)=='E' ||line.charAt(i)=='I' ||line.charAt(i)=='O' ||line.charAt(i)=='U' ||line.charAt(i)=='a' || line.charAt(i)=='e' ||line.charAt(i)=='i' ||line.charAt(i)=='o' ||line.charAt(i)=='u' ) {
				vowels++;
			}else if((line.charAt(i)>='A'&&line.charAt(i)<='Z')||(line.charAt(i)>='a'&&line.charAt(i)<='z')){
				consonant++;
			}
		}
		System.out.println("Vowels = " +vowels);
		System.out.println("Consonant = " +consonant);
	}
}
