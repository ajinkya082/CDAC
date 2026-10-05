package com.Array;
import java.util.Scanner;

public class Array2D {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[][];
		System.out.println("Enter rows and column of array: \n");
		int rows=sc.nextInt();
		int col=sc.nextInt();
		arr=new int[rows][col];
		
		for(int  i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter element at arr["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("\n Array is: \n");
		for(int  i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
//				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
	}
}
