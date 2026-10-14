package com.Practise.Sorting;

public class QuickSortPr {
	static void quick_sort(int a[],int start,int end) {
		int i,j,pivot;
		i=start;
		j=end;
		pivot=start;
		while(i<j) {
			while(a[j]>a[pivot]) {
				j--;	
			}
			if(i<j) {
				int temp=a[i];a[i]=a[j];a[j]=temp;
			}
		}
		if(i<end) {
			quick_sort(a,i+1,end);
		}
	}
	static void display(int a[]) {
		System.out.print("\nArray has :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
	public static void main(String[]args) {
		int arr[]= {10,6,1,4,2};
//		quick_sort_from_start(arr, 0, arr.length-1);
		quick_sort(arr, 0, arr.length-1);
		display(arr);
	}
}
