package com.LinkedList;

public class Employee {

	int e_id;
	String name;
	String gender;
	float salary;
	
	Employee(int e_id,String name,String gender,float salary){
		this.e_id=e_id;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
	}
	//display
	void display_employee() {
		System.out.print("\nE_id: "+e_id+"\tName: "+ name + "\tGender: " + gender + "\tSalary: " + salary);
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	//
}
