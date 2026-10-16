package com.Collection;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManagementSystem {
	public static void main(String []args) {
		HashMap<Integer,Student>list=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		s1.setData(1, "Ajinkya", "Male",85.5f);
		list.put(s1.getRoll(), s1);
		int roll_no=1;
		if(list.containsKey(roll_no)) {
			Student temp=list.get(roll_no);
			System.out.println("Student Found!");
		}else {
			System.out.println("Student Not found!!");
		}
		
		System.out.println("Enter roll no to update :");
		int update_roll=sc.nextInt();
		sc.nextLine();
		if(list.containsKey(update_roll)) {
			Student temp=list.get(update_roll);
			
			System.out.println("Enter updated name :");
			String name=sc.nextLine();
			
			System.out.println("Enter updated gender :");
			String gender=sc.nextLine();
			
			System.out.println("Enter updated Pointer :");
			float pointer=sc.nextFloat();
			
			list.put(update_roll, temp);
			temp.display();
		}
	}
}
