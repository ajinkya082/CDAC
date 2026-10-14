package com.Practise.Sorting;

public class HeapSortPr {
	static void heap_sort(int a[]) {
		int i,pc,j;
		for(i=a.length-1;i>0;i--) {
			for(j=0;j<=i;j++) {
				pc=j;
				while(pc > 0) {
					if(a[pc]>a[pc/2]) {
						int temp=a[pc];
						a[pc]=a[pc/2];
						a[pc/2]=temp;
						pc=pc/2;
					}else {
						break;
					}
				}
				int temp=a[i];a[i]=a[0];a[0]=temp;
			}
		}
	}
	static void display(int a[]) {
		System.out.print("\nArray is:");
		for(int x:a) {
			System.out.print(x+",");
		}
	}
	public static void main(String[]args) {
		int arr[]= {50,5,42,36,1,2};
		display(arr);
		System.out.print("\nArray after heap sort is:");
		heap_sort(arr);
		display(arr);
	}
}
