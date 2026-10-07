package com.Stack_Example;

import java.util.Scanner;
import java.util.Stack;

public class Wellness_Check 
{
	static boolean check(String pattern)
	{
		Stack<Character> stack = new Stack<>();

		// STUDENT: Write logic to check
		// whether the pattern contains balanced { }
		for(int i=0;i<pattern.length();i++) {
			char c=pattern.charAt(i);
			if(c=='{') {
				stack.push(pattern.charAt(i));
			}
			if(c=='}') {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
		
		
		return (stack.isEmpty());
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String pattern;

		System.out.println("Enter pattern to check:");
		pattern = sc.next();

		System.out.print("\nPattern is balanced:" + check(pattern));

	}

}
