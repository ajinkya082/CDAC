package com.Searching;

public class SequentialSearch {
	static int sequential_search(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args) {
		int arr[]= {1,56,62,87,20,63};
		int key=566;
		int result=sequential_search(arr, key);
		if(result==-1) {
			System.out.print(key+" not found ");
		}
		else {
			System.out.print(key+" found at:"+result);
		}
	}
}
