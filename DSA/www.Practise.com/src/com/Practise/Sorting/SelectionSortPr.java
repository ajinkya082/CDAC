package com.Practise.Sorting;

public class SelectionSortPr {
	static void selection_sort(int a[]) {
		int i,j,min,position;
		for(i=0;i<a.length-1;i++) {
			min=a[i];
			position=i;
			for(j=i+1;j<a.length;j++) {
				if(a[j]<min) {
					min=a[j];
					position=j;
				}
			}
			a[position]=a[i];
			a[i]=min;
		}
	}
	static void display(int a[]) {
		System.out.print("\nArray has:");
		for(int x:a) {
			System.out.print(x+",");
		}
	}
	public static void main(String[]args) {
		int a[]= {22,8,9,98,20};
		display(a);
		System.out.print("\nArray after sorting:");
		selection_sort(a);
		display(a);
	}
}
