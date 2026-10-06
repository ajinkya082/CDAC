package com.HumanManagementSystem;

public class Human {
	private String name,gender,adhar;
	
	public void set_Human(String name,String gender,String adhar) {
		this.name=name;
		this.gender=gender;
		this.adhar=adhar;
	}
	public void display_Human() {
		System.out.print("\nAdharcard no :"+adhar+"\tName:"+name+"\tGender:"+gender);
	}
	public String get_adhar() {
		// TODO Auto-generated method stub
		return adhar;
	}
}
