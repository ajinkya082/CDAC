package com.Assignment;

import java.util.Scanner;

public class Min_Max {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		arr=new int[size];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			System.out.println("Enter element at:"+i);
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
			 if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("largest = " + max);
		System.out.println("Smallest = "+ min);
		
		sc.close();
	}

}


