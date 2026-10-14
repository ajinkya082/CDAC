package com.Stack;

import java.util.Stack;

public class NextGreaterElement {
	public void nextGreater(int arr[]) {
		Stack<Integer> stack=new Stack<>();
	
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					stack.push(arr[j]);
					flag=true;
					break;
				}
			}
			if(!flag) {
				stack.push(-1);
			}
		}
		System.out.print(stack);
	}
	public static void main(String [] args) {
		NextGreaterElement ngm=new NextGreaterElement();
		int arr[] = {4,5,2,10,8};
		ngm.nextGreater(arr);
		
	}
}
