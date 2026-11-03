package collection_framework;

import java.util.LinkedList;

public class LinkedListExampleMain {
	public static void main(String[] args) {
 		LinkedList ll=new LinkedList(); 
 		ll.add("Vanilla");
 		ll.add("Mango");
 		ll.add("Butterscotch");
 		for(Object obj:ll) {
 			System.out.println(obj);
 		}
 		System.out.println("===============Adding new element at top================");
 		ll.addFirst("Strawberry");
 		for(Object obj:ll) {
 			System.out.println(obj);
 		}
 		System.out.println("First element " + ll.getFirst());
 		System.out.println("Last element " + ll.getLast());
 		
 		System.out.println("===========Removing elements from top and bottom=======================");
 		ll.removeFirst();
 		ll.removeLast();
 		for(Object obj:ll) {
 			System.out.println(obj);
 		}
	}
}
