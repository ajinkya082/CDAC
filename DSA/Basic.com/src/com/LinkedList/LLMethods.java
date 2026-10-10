package com.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LLMethods {
	 public static void main(String[] args) {

	        LinkedList<Integer> list = new LinkedList<>();

	        // Adding elements
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.addFirst(5);
	        list.addLast(40);

	        System.out.println("Original: " + list);

	        // Accessing elements
	        System.out.println("First: " + list.getFirst());
	        System.out.println("Last: " + list.getLast());
	        System.out.println("Index 2: " + list.get(2));

	        // Searching
	        System.out.println("Contains 20: " + list.contains(20));
	        System.out.println("Index of 30: " + list.indexOf(30));
	        System.out.println("Size: " + list.size());

	        // Updating
	        list.set(1, 15);
	        System.out.println("After update: " + list);

	        // Removing
	        list.removeFirst();
	        list.removeLast();
	        System.out.println("After removal: " + list);

	        // Sorting and reversing
	        Collections.sort(list);
	        System.out.println("Sorted: " + list);

	        Collections.reverse(list);
	        System.out.println("Reversed: " + list);

	        // Traversing
	        for (Integer x : list) {
	            System.out.println(x);
	        }

	        // Clear
	        list.clear();
	        System.out.println("Empty: " + list.isEmpty());
	    }

}
