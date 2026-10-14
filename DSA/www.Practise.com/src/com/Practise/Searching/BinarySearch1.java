package com.Practise.Searching;

public class BinarySearch1 {
	static int binary_search(int a[],int key,int start,int end) {
		if(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==key) {
				return mid;
			}
			else {
				if(key<a[mid]) {
					return binary_search(a, key, start, mid-1);
				}else {
					return binary_search(a, key, mid+1, end);
				}
			}
		}
		return -1;
	}
	public static void main(String []args) {
		int arr[]= {1,6,9,30,54,62,99};
		int key=540;
		int result=binary_search(arr, key, 0, arr.length-1);
		if(result==-1) {
			System.out.println(key+" Not Found");
		}else {
			System.out.print(key+" Found at:"+result);
		}
	}
}
