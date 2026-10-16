package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class WellNessCheck {
	public static boolean checkParenthessis(String str) {
		Stack <Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='('||ch=='['||ch=='{') {
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				char top=stack.pop();
				if(ch=='}'&&top!='{'||ch==']'&&top!='['||ch==')'&&top!='(') {
					return false;
				}
			}
		}
		return (stack.isEmpty());
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter your pattern :");
		String pattern=sc.nextLine();
		System.out.print(checkParenthessis(pattern));
	}
}
