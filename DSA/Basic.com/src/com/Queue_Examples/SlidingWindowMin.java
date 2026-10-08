package com.Queue_Examples;

//import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class SlidingWindowMin {
	public static void main(String[] args) {
		//	ArrayDeque <Integer> pq= new ArrayDeque<>();
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int arr[]= {1,5,2,8,3,6,2,9};
		int k=3;
		for(int i=0;i<arr.length;i++) {
			pq.offer(arr[i]);
			if(pq.size()>k) {
				pq.remove(arr[i-k]);
			}
			if(pq.size()==k) System.out.print("\n---->"+pq + "min:"+pq.peek());
		}
	}
}
