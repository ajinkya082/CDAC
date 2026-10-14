package com.Searching;

public class BinarySearch {
	static int binary_search(int a[],int key,int start,int end) {
		if(start<=end) {
			int mid=(start+end)/2;
			if(key==a[mid]) {
				return mid;
			}else {
				if(key<a[mid]) {
					return binary_search(a, key, start, mid-1);
				}
				else {
					return binary_search(a, key, mid+1, end);
				}
			}
		}
		return -1;
	}
	public static void main(String[]args) {
//		int arr[]= {1,56,62,87,20,63};
		int arr[]= {1,3,6,9,56,90};
		int key=56;
		int result=binary_search(arr, key,0,arr.length-1);
		if(result==-1) {
			System.out.print(key+" not found ");
		}
		else {
			System.out.print(key+" found at:"+result);
		}
	}
}
