package com.Practise.AC;

public class LargestArray {
	public static void getLargest(int arr[]) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum is :"+max);
		System.out.print("Minimum is :"+min);
	}
	public static void main(String[]args) {
		int arr[]= {1,2,6,3,5};
//		System.out.println();
		getLargest(arr);
	}
}
