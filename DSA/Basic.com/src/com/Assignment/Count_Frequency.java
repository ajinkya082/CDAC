package com.Assignment;

import java.util.Scanner;

public class Count_Frequency {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		boolean [] visited=new boolean[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter element at:" + i);
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					visited[j]=true;
				}
				
			}
			System.out.println(a[i]+"->"+count);
		}
		sc.close();
	}
}
