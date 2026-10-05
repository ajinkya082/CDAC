package com.Assignment;

import java.util.Scanner;

public class Rotations {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element at:" + i);
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number of rotations:");
		int rotation=sc.nextInt();
		for(int i=0;i<rotation;i++) {
			int temp=a[size-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		System.out.println("Array after rotations:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
