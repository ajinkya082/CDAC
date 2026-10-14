package com.Sortings;

public class SelectionSorting {
	static void selection_sort(int a[]) {
		int i,j,min,position;
		for( i=0;i<a.length-1;i++) {
			min=a[i];
			position=i;
			for( j=i+1;j<a.length;j++) {
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
		System.out.print("\nArray has :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
	public static void main(String[]args) {
		int arr[]= {1,5,9,3,7,6};
		display(arr);
		selection_sort(arr);
		display(arr);
	}
}
