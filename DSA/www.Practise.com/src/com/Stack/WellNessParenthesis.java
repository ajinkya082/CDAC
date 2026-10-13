package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class WellNessParenthesis {

	public boolean isTrue(String pattern) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<pattern.length();i++) {
			char c=pattern.charAt(i);
			if(c=='{'||c=='['||c=='(') {
				stack.push(c);
			}
			if(stack.isEmpty()) {
				return false;
			}
			else {
				if((c=='}'&&stack.peek()=='{')||(c==']'&&stack.peek()=='[')||(c==')'&&stack.peek()=='(')) {
						stack.pop();
					}
				}
			}
		return (stack.isEmpty());
		}

		
	
	public static void main(String[] args) {
		WellNessParenthesis wp=new WellNessParenthesis();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pattern:");
		String pattern=sc.nextLine();
		System.out.println(wp.isTrue(pattern));
		sc.close();
	}
}
