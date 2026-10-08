package com.Assignment;

import java.util.Scanner;

public class IntPre {
	static char s[] = new char[100];
	static int tos, maxsize;
	static void createStack(int n) {
		maxsize = n;
		tos = -1;
	}
	static void push(char e) {
		tos++;
		s[tos] = e;
	}
	static char pop() {
		char temp = s[tos];
		tos--;
		return temp;
	}
	static boolean isEmpty() {
		return tos == -1;
	}
	static int prec(char ch) {
		if (ch == '+' || ch == '-')
			return 1;
		if (ch == '*' || ch == '/' || ch == '%')
			return 2;
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char in[], pre[] = new char[100];
		char c;
		int pi = 0;
		System.out.print("Enter infix:");
		String input = sc.nextLine();
		in = input.toCharArray();
		createStack(in.length);
		// Scan from RIGHT to LEFT
		for (int i = in.length - 1; i >= 0; i--) {
			c = in[i];
			switch (c) {
			case ')':
				push(c);
				break;
			case '(':
				while (!isEmpty() && s[tos] != ')') {
					pre[pi] = pop();
					pi++;
				}
				if (!isEmpty())
					pop();
				break;
			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
				while (!isEmpty() && prec(c) < prec(s[tos])) {
					pre[pi] = pop();
					pi++;
				}
				push(c);
				break;
			default:
				pre[pi] = c;
				pi++;
				break;
			}
		}
		while (!isEmpty()) {
			pre[pi] = pop();
			pi++;
		}
		String prefix =new StringBuilder(new String(pre, 0, pi)).reverse().toString();
		System.out.println("Prefix is : "  + prefix);
		sc.close();
	}
}
