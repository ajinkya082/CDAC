package com.Array;

import java.util.Scanner;

public class Variable_Size_Array {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int a[][]=new int[3][];//I clearly define that it has three rows. The number of columns we haven't specified.
		a[0]=new int [5];
		a[1]=new int[2];
		a[2]=new int[4];
		//First accept needed elements and then print them in a proper manner.
		System.out.print("\na.length:"+a.length);
		System.out.print("\na[0].length:"+a[0].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("\nEnter element at arr["+i+"]["+j+"]:\n");
				a[i][j]=sc.nextInt();
			}
		}
		
		//print
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
//				System.out.println("Enter element at arr["+i+"]["+j+"]");
//				a[i][j]=sc.nextInt();
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}