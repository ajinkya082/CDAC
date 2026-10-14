package com.Practise.Sorting;

public class BubbleSortPr {
	static void bubble_sort(int a[]) {
		int i,j,count=0;
		for(i=0;i<a.length-1;i++) {
			for(j=0;j<a.length-1;j++) {
				System.out.print("\nPass:"+ (++count));
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	static void bubble_sort_improved(int a[]) {
		int i,j,count=0;
		for(i=a.length-1;i>0;i--) {
			boolean sorted=true;
			for(j=0;j<i;j++) {
				System.out.print("\nPass:"+ (++count));
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					sorted=false;
				}
				if(sorted) {
					break;
				}
			}
		}
	}
	static void display(int a[]) {
		System.out.print("\nArray is :");
		for(int i:a) {
			System.out.print(i+",");
		}
	}
	public static void main(String [] args) {
//		int arr[]= {6,8,1,3,9,10};
		int arr[]= {1,2,3,4,5,6};
		display(arr);
		System.out.print("\nArray after simple bubble sorting ");
		bubble_sort(arr);
		display(arr);
		System.out.print("\nArray after improved bubble sorting ");
		bubble_sort_improved(arr);
		display(arr);
	}
}
