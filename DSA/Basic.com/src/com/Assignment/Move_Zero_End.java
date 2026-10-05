package com.Assignment;

import java.util.Scanner;

public class Move_Zero_End {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element at:" + i);
			a[i]=sc.nextInt();
		}

		int pos=0;
		for(int i=0;i<size;i++) {
			if(a[i]!=0) {
				a[pos]=a[i];
				pos++;
			}
			
		}
		while(pos<size) {
			a[pos]=0;
			pos++;
		}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
