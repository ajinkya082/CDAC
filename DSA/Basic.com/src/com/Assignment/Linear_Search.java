package com.Assignment;

import java.util.Scanner;

public class Linear_Search {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		arr=new int[size];
		boolean flag=false;

		for(int i=0;i<size;i++) {
			System.out.println("Enter element at:"+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number to search:");
		int search=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==search) {
				System.out.println("Key Found at index :"+i);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("-1");
		}
		sc.close();
	}
}
