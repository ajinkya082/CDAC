package com.Assignment;

import java.util.Scanner;

public class InToPost {
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
		char in[], post[] = new char[100];
		char c;
		int pi = 0;
		System.out.print("Enter infix:");
		String input = sc.nextLine();
		in = input.toCharArray();
		createStack(in.length);
		for (int i = 0; i < in.length; i++) {
			c = in[i];
			switch (c) {
			case '(':
				push(c);
			break;
			case ')':
				while (!isEmpty() && s[tos] != '(') {
					post[pi] = pop();
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
			while (!isEmpty() && prec(c) <= prec(s[tos])) {
					post[pi] = pop();
					pi++;
				}
			push(c);
			break;
			default:
				post[pi] = c;
				pi++;
				break;
			}
		}
		while (!isEmpty()) {
			post[pi] = pop();
			pi++;
		}
		System.out.println("Postfix is :" + new String(post, 0, pi));
		sc.close();
	}
}
