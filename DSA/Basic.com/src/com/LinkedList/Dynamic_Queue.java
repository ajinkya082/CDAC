package com.LinkedList;

import java.util.Scanner;

public class Dynamic_Queue {
	Node front,rear;//Only Node, which you know and you will record

	//insert right
	void enqueue(int data)
	{
		Node n=new Node(data);
		if(rear==null)//on first
		{
			front=n;
			rear=n;
		}
		else
		{
//			Node t=front;//1:assign t to root address
//			while(t.next!=null)//2:go till end
//				{t=t.next;}//step
//			t.next=n;//3:connect
			rear.next=n;
			rear=n;
		}
	}

	//    delete left
	void dequeue()
	{
		if(front==null)//on first
			System.out.print("\nEmpty list");
		else
		{
			Node t=front;//1
			if(front==rear) {
				front=rear=null;
				
			}
			else {
			front=front.next;//2
			System.out.print("\nDeleted:"+t.data);
		
	       }
		}
	}
	
	void print()
	{
		if(front==null)//on first
			System.out.print("\nEmpty Queue");
		else
		{
			Node t=front;//1
			System.out.print("Element are\n");
			while(t!=null)//2
			{
				System.out.print("|"+ t.data+"|-");
				System.out.print( "-----");
				t=t.next;
			}
		
		}

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Dynamic_Queue s=new Dynamic_Queue();
		int choice;
		int e;
		do {

			System.out.println("\n\nSTACK MENU");
			System.out.println("-------------------------");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Print Queue");
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
				s.enqueue(e);
				break;


			case 2:
				s.dequeue();
				break;


			case 3:
				s.print();
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
