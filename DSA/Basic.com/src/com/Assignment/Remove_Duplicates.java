package com.Assignment;

import java.util.Scanner;

public class Remove_Duplicates {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter element at:" + i);
			a[i]=sc.nextInt();
		}
		int newSize=1;
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]!=a[newSize-1]){
				a[newSize]=a[i];
				newSize++;
			}
		}
		System.out.println("New Length:"+newSize);
		for(int i=0;i<newSize;i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
