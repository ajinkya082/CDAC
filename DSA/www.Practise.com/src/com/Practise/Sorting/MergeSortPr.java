package com.Practise.Sorting;

public class MergeSortPr {
	static void merger(int a[],int start,int mid,int end) {
		int i,j,t_index,temp[];
		i=start;
		t_index=start;
		j=mid+1;
		temp=new int[a.length];
		while(i<=mid&&j<=end) {
			if(a[i]<a[j]) {
				temp[t_index++]=a[i++];
			}
			else {
				temp[t_index++]=a[j++];
			}
		}
		while(i<=mid) {
			temp[t_index++]=a[i++];
		}
		while(j<=end) {
			temp[t_index++]=a[j++];
		}
		for(i=start;i<=end;i++) {
			a[i]=temp[i];
		}
	}
	static void merge_sort(int a[],int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;
			merge_sort(a,start,mid);
			merge_sort(a,mid+1,end);
			merger(a,start,mid,end);
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
		display(arr);
		System.out.print("\nArray after merging is -");
		merge_sort(arr, 0, arr.length-1);
		display(arr);
	}
}
