package com.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class MergeLinkedList {
	static LinkedList<Integer> combine(
            LinkedList<Integer> l1,
            LinkedList<Integer> l2) {

        // Create the third LinkedList
        LinkedList<Integer> l3 = new LinkedList<>();

        // TODO 1: Declare two integer variables
        // to track positions in l1 and l2.
        int pos1=0;
        int pos2=0;


        // TODO 2: Traverse both lists while
        // elements are available in both.
        while(pos1<l1.size()&&pos2<l2.size()) {
        	if(l1.get(pos1)<l2.get(pos2)) {
        		l3.add(l1.get(pos1));
        		pos1++;
        	}else {
        		l3.add(l2.get(pos2));
        		pos2++;
        	}
        }


        // TODO 3: Compare the current elements
        // of l1 and l2.
        

        // TODO 4: Add the smaller element to l3
        // and advance the corresponding position.


        // TODO 5: Add the remaining elements
        // of l1, if any.
        while (pos1 < l1.size()) {
            l3.add(l1.get(pos1));
            pos1++;
        }
        

        // TODO 6: Add the remaining elements
        // of l2, if any.
        while (pos2 < l2.size()) {
            l3.add(l2.get(pos2));
            pos2++;
        }


        // Return the merged LinkedList
//        LinkedList<Integer> l3 = combine(l1, l2);
        
        return l3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        // Input first sorted list
        System.out.print("Enter size of List 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter sorted elements of List 1:");
        for (int i = 0; i < n1; i++) {
            l1.add(sc.nextInt());
        }

        // Input second sorted list
        System.out.print("Enter size of List 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter sorted elements of List 2:");
        for (int i = 0; i < n2; i++) {
            l2.add(sc.nextInt());
        }

        System.out.println("List 1: " + l1);
        System.out.println("List 2: " + l2);

        // TODO 7: Call combine() by passing l1 and l2
        // Store the returned LinkedList in l3.
        LinkedList<Integer> l3 = combine(l1, l2);

        // TODO 8: Display the merged list.
        System.out.println("Merged List: " + l3);

        sc.close();
    }

}
