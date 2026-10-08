package com.Queue_Examples;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Collection {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	Queue<Integer> obj=new ArrayDeque<>();

	int choice = 0;
	
	do
	{
		System.out.print("\n\nQueue Menu");
		System.out.print("\n-----------");
		System.out.print("\n1. Enqueue");
		System.out.print("\n2. Dequeue");
		System.out.print("\n3. Print Queue");
		System.out.print("\n0. Exit");
		System.out.print("\nEnter choice: ");
		
		
		choice = sc.nextInt();

		switch(choice)
		{
		case 1:
		
				int e;
				System.out.print("Enter element: ");
				e = sc.nextInt();
				obj.offer(e);
			
			break;

		case 2:
			if(!obj.isEmpty())
				System.out.print("Dequeued Element: " + obj.poll());
			else
				System.out.print("Queue Empty");
			break;

		case 3:
			if(!obj.isEmpty())
				System.out.print(obj);
			else
				System.out.print("Queue Empty");
			break;

		case 0:
			System.out.print("\nExiting... coded by Amar Career Credentials");
			break;

		default:
			System.out.print("Invalid choice");
		}

	} while(choice != 0);
	sc.close();
}

}
