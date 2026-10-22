package com.Practise.AC;

public class BinaryS {
	static int binarySearch(int arr[],int start,int end,int key) {
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else {
				if(key<arr[mid]) {
					return binarySearch(arr, start, mid-1, key);
				}
				else {
					return binarySearch(arr, mid+1, end, key);
				}
			}
		}
		return -1;
	}
	public static void main(String[]args) {
		int arr[]= {2,4,6,8,10,12,15};
		int key =2;
		int result=binarySearch(arr, 0, arr.length-1, key);
		if(result==-1) {
			System.out.println(key+" Not Found");
		}else {
			System.out.print(key+" Found at:"+result);
		}
	}
}
