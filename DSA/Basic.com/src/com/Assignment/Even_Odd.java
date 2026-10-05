package com.Assignment;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		arr=new int[size];
		int count_Even=0;
		int count_Odd=0;
		for(int i=0;i<size;i++) {
			System.out.println("Enter element at:"+i);
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				count_Even++;
			}else if(arr[i]%2!=0) {
				count_Odd++;
			}
		}
		System.out.println("Even = " + count_Even);
		System.out.println("Odd = " + count_Odd);
		sc.close();
	}
}
