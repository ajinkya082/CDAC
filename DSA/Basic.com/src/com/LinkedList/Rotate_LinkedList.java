package com.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Rotate_LinkedList {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
        LinkedList<Integer> list=new LinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        System.out.println(list);
//        list.addLast(list.removeFirst());
//        System.out.println(list);
        int element;
        System.out.println("Enter Size of list :");
        int size=sc.nextInt();
        System.out.println("Enter Size of rotation :");
        int rotate=sc.nextInt();
        
        for(int i=0;i<size;i++) {
        	System.out.println("Enter element :");
             element=sc.nextInt();
            list.add(element);
        }
        for(int i=0;i<rotate;i++) {
        	
//            list.addLast(list.removeFirst());//anti clock-wise
            list.addFirst(list.removeLast());//clock-wise
            System.out.println(list);
        }
        sc.close();
    }
	
}
