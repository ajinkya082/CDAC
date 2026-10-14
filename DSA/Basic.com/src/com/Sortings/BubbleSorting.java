package com.Sortings;

public class BubbleSorting {
	static void buble_sort(int a[]) {
		int i,j,temp , count=0;
		for( i=0;i<a.length-1;i++) {
			for( j=0;j<a.length-1;j++) {
				System.out.print("\npass:" +(++count));
				if(a[j]>a[j+1]) {
					temp=a[j];a[j]=a[j+1];a[j+1]=temp;
				}
			}
		}
	}
	static void buble_sort_improved(int a[]) {
		int i,j,temp , count=0;
		for( i=a.length-1;i>0;i--) {
			for( j=0;j<i;j++) {
				System.out.print("\npass:" +(++count));
				if(a[j]>a[j+1]) {
					temp=a[j];a[j]=a[j+1];a[j+1]=temp;
				}
			}
		}
	}
	static void display(int a[]) {
		System.out.print("\nArray has :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
	public static void main(String [] args) {
		int arr[]= {1,5,9,3,7,6};
		display(arr);
//		buble_sort(arr);
		buble_sort_improved(arr);
		display(arr);
	}
}
