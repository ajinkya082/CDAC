package com.Assignment;

import java.util.Scanner;

public class Reversed_Array {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		arr=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter element at:"+i);
			arr[i]=sc.nextInt();
		}
		int i=0,j=size-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k=0;i<size;k++) {
			System.out.print(arr[k] + " ");
		}
		sc.close();
	}
}
