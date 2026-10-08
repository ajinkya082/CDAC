package com.Queue_Examples;

import java.util.PriorityQueue;
class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

public class Priority_Queue_Collection {
	    public static void main(String[] args) {
	        PriorityQueue<Student> pq =new PriorityQueue<>((s1, s2) -> s1.marks - s2.marks);//s1-s2:ascending order ,,  s2-s1:descending order
	        pq.offer(new Student("Amit", 70));
	        pq.offer(new Student("Rahul", 90));
	        pq.offer(new Student("Neha", 80));
	        while(!pq.isEmpty())
	        {
	            Student s = pq.poll();

	            System.out.println(
	                    s.name + " " + s.marks
	            );
	        }

	    }

}
