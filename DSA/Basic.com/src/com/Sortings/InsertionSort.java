package com.Sortings;

public class InsertionSort {
	static void insertionSort(int a[]) {
		int i,j,new_element;
		for(i=0;i<a.length-1;i++) {
			j=i+1;
			new_element=a[i+1];
			while(j>0&&a[j-1]>new_element) {
					a[j]=a[j-1];
					j--;
			}
			a[j]=new_element;
		}
	}
	static void display(int a[]) {
		System.out.print("\nArray has :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
	public static void main(String[]args) {
//		int arr[]= {10,6,1,4,2};
		int arr1[]= {2,1,3,9,6};
		insertionSort(arr1);
		display(arr1);
	}
}
