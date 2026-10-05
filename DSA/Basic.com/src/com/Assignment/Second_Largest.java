package com.Assignment;

import java.util.Scanner;

public class Second_Largest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int max=Integer.MIN_VALUE;
		int smax=max;
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter element at : "+i);
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax&&a[i]<max) {
				smax=a[i];
			}
		}
		if(smax==Integer.MIN_VALUE) {
			System.out.println("-1");
		}
		else {
			System.out.println("Second Largest="+smax);
		}

	}
}
