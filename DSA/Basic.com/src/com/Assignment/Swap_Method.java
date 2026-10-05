package com.Assignment;

import java.util.Scanner;

public class Swap_Method {

	public void swap(int[] a,int i,int j) {

		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;

	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		Swap_Method sm=new Swap_Method();
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter element at :" + i);
			a[i]=sc.nextInt();
		}
		
		sm.swap(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
