package com.Collection;

public class Student {
	private int roll;
	private String name,gender;
	private float pointer;
	
	public void  setData(int roll,String name,String gender,float pointer) {
		this.roll=roll;
		this.name=name;
		this.gender=gender;
		this.pointer=pointer;
	}
	public void display() {
		System.out.print("\nRoll no: " + roll+"\tName: " + name+"\tGender: " + gender + "\nPointer: "  + pointer);
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
