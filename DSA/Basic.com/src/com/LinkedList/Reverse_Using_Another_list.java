package com.LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class Reverse_Using_Another_list {
	public static void main(String [] args) {
		LinkedList<Integer> list=new LinkedList<>();
		Stack<Integer> stack =new Stack<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("list is "+list);
		for(int i=0;i<list.size();i++) {
			stack.push(list.get(i));
		}
		for(int i=0;i<list.size();i++) {
			list.set(i, stack.pop());
		}
		System.out.println("list is "+list);
//		System.out.println(stack);
		
	}
}
