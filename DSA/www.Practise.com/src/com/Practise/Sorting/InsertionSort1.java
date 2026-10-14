package com.Practise.Sorting;

public class InsertionSort1 {
	static void insertion_sort(int a[]) {
		int i,j,newElement;
		for(i=0;i<a.length-1;i++) {
			j=i+1;
			newElement=a[i+1];
			while(j>0 && a[j-1]>newElement) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=newElement;
		}
	}
	static void display(int a[]) {
		System.out.print("\nThe array after sorting is:");
		for(int x:a) {
			System.out.print(x+",");
		}
	}
	public static void main(String []args) {
		int arr[]= {2,1,3,9,6};
		display(arr);
		insertion_sort(arr);
		display(arr);
	}
}
