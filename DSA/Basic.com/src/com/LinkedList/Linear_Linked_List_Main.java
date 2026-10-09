package com.LinkedList;

import java.util.Scanner;

public class Linear_Linked_List_Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		LinearLinkedList l=new LinearLinkedList();
		int choice ,e,ref;
		
		do {
			System.out.println("\n============Menu==============");
			System.out.println("1.insert left");
			System.out.println("2.insert right");
			System.out.println("3.delete left");
			System.out.println("4.delete right");
			System.out.println("5.Print");
			System.out.println("6.Search List");
			System.out.println("7.insert after");
			System.out.println("8.Delete element");
			System.out.println("0.Exit");
			System.out.println("============End Menu==============");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element to insert at left:");
				e=sc.nextInt();
				l.insert_left(e);
				
				break;
			case 2:
				System.out.println("Enter element to insert at right:");
				e=sc.nextInt();
				l.insert_right(e);
				break;
			case 3:
				l.delete_left();
				break;
			case 4:
				l.delete_right();
				break;
			case 5:
				l.print_list();
				break;
			case 6:
				System.out.print("Enter reference element: ");
                ref = sc.nextInt();

                System.out.print("Enter new data: ");
                e = sc.nextInt();

                l.insert_after(ref, e);
                break;
			case 7:
				System.out.print("Enter element to delete: ");
                e = sc.nextInt();
                l.delete_element(e);
                break;
			case 8:
				 System.out.print("Enter element to search: ");
                 e = sc.nextInt();

                 if(l.search_list(e))
                     System.out.println(e + " Found");
                 else
                     System.out.println(e + " Not Found");

                 break;
			case 0:
				System.out.println("Exit....");


			}
			
		}while(choice!=0);
	}
	
}
