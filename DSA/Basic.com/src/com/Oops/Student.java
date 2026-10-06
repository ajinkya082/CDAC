package com.Oops;

public class Student {
	private int roll_no;
	private String name;
	private String gender;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	
	public void set_details(int roll_no,String name, String gender,int sub1,int sub2,int sub3,int sub4,int sub5) {
		this.roll_no=roll_no;
		this.name=name;
		this.gender=gender;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
	}
	
	public void calculate_result() {
		int total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("The total marks of student are: "+total);
		float percentage=total/5.0f;
		System.out.println("The average percentage of student is: "+percentage+"%");
	}
	public void display_result() {
		System.out.println("=============Student Details================");
		System.out.println("Student Roll No is:"+roll_no);
		System.out.println("Student  Name is:"+name);
		System.out.println("Student Gender is:"+gender);
		System.out.println("Student Marks in Sub1 is:"+sub1);
		System.out.println("Student Marks in Sub2 is:"+sub2);
		System.out.println("Student Marks in Sub3 is:"+sub3);
		System.out.println("Student Marks in Sub4 is:"+sub4);
		System.out.println("Student Marks in Sub5 is:"+sub5);
		calculate_result();
	}
}
