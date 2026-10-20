package com.Practise.Searching;

public class SequentialSearch {
	static int seqSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String []args) {
		int arr[]= {5,9,6,7,2,0};
		int key=2;
		System.out.print(seqSearch(arr, key));
	}
}
