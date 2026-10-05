package com.Assignment;

import java.util.Scanner;

public class Sum_Avg {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		arr=new int[size];
		int sum=0;
		float avg;
		for(int i=0;i<size;i++) {
			System.out.println("Enter element at:"+i);
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		avg=(float)sum/size;
		System.out.println("Sum = "+sum);
		System.out.println("Average is = "+ String.format("%.2f", avg));
		sc.close();
	}
}
