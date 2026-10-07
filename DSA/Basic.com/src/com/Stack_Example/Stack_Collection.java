package com.Stack_Example;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Collection {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Stack<Integer> s=new Stack<>();

//	        int size;
	        int choice;
	        int e;

	       
	        // Create the stack
	        // TODO: Call createStack() method
//	        s=new s[size];
	        

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
	                    

	                    System.out.print("Enter element: ");
	                    e = sc.nextInt();
	                    	 s.push(e);
	                    break;


	                case 2:
	                    // POP
	                    // TODO:
	                    // Before popping, check whether stack is empty
	                    //
	                     if (s.isEmpty())
	                     {
	                         System.out.println("Stack is Empty");
	                     }
	                     else
	                     {
	                         e = s.pop();
	                         System.out.println("Deleted element: " + e);
	                     }

	                    break;


	                case 3:
	                    // PEEK
	                    // TODO:
	                    // Check whether stack is empty
	                    //
	                     if (s.isEmpty())
	                     {
	                         System.out.println("Stack is Empty");
	                     }
	                     else
	                     {
	                         e = s.peek();
	                         System.out.println("Top element: " + e);
	                     }

	                    break;


	                case 4:
	                    // PRINT STACK
	                    // TODO:
	                    // Check whether stack is empty
	                    //
	                     if (s.isEmpty())
	                     {
	                         System.out.println("Stack is Empty");
	                     }
	                     else
	                     {
	                         System.out.println(s);
	                     }

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
