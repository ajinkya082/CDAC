package com.LinkedList;

import java.util.Scanner;

public class Dynamic_Stack {
	Node tos;
	//insert left
	void push(int data)
	{
		Node n=new Node(data);
		if(tos==null)//on first
			tos=n;
		else
		{
			n.next=tos;//1
			tos=n;//2
		}
	}

	//    delete left
	void pop()
	{
		if(tos==null)//on first
			System.out.print("\nEmpty Stack");
		else
		{
			Node t=tos;//1
			tos=tos.next;//2
			System.out.print("\nPoped:"+t.data);
		}
	}
	void peek()
	{
		if(tos==null)//on first
			System.out.print("\nEmpty Stack");
		else
		{
			System.out.print("\nAt Peek we have:"+tos.data);
		}
	}

	void print_stack()
	{
		if(tos==null)//on first
			System.out.print("\nEmpty Stack");
		else
		{
			Node t=tos;//1
			System.out.print("Element are\n");
			while(t!=null)//2
			{
				System.out.print("|"+ t.data+"|");
				System.out.print( "\n-----\n");
				t=t.next;
			}
		}

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Dynamic_Stack s=new Dynamic_Stack();
		int choice;
		int e;
		do {

			System.out.println("\n\nSTACK MENU");
			System.out.println("-------------------------");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Print Stack");
			System.out.println("0. Exit");
			System.out.println("-------------------------");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				// PUSH
				// Accept an element from user
				System.out.print("Enter element: ");
				e = sc.nextInt();
				s.push(e);
				break;


			case 2:
				s.pop();
				break;


			case 3:
				s.peek();
				break;


			case 4:
				s.print_stack();
				break;


			case 0:
				System.out.println("Exiting Stack Program...");
				break;


			default:
				System.out.println("Wrong choice!");
			}
		} while (choice != 0);
		sc.close();
	}

}
