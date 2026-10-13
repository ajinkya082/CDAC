package com.Practise.LinkedList;

public class MenuLL {
	public static void main(String []args) {
		LLMethodsAll ll=new LLMethodsAll();
		ll.insert_left(10);
		ll.insert_left(20);
		ll.insert_left(30);
		ll.insert_left(50);
		ll.insert_left(42);
		System.out.print("The Linked List is :");
		ll.display();
//		ll.deleteN(2);
//		System.out.print("\nThe Linked List  after deletion is :");
//		ll.display();
		System.out.print("\nThe ll data from end by  index 2 is :"+ll.findNth(2));
	}
}
