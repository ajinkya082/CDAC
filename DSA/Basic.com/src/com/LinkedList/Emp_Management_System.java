package com.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Emp_Management_System {
	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		// list.addLast(e1);
		// Employee e2=new Employee(2,"amana","male",20200);
		// list.addLast(e2);
		// Employee e3=new Employee(3,"chamana","female",2200);
		// list.addLast(e3);
		// Employee e4=new Employee(4,"jamana","female",21000);
		// list.addLast(e4);
		// System.out.println(list);
		// for(Employee emp:list) {
		// emp.display_employee();
		// }
		// int choice,e_id;
		// String name,gender;
		// float salary;
		int choice;

		do {

			System.out.println("========== EMPLOYEE MANAGEMENT SYSTEM ==========");
			System.out.println("-------------------------");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee by ID");
			System.out.println("3.  Delete Employee by ID");
			System.out.println("4. Change Employee Details by ID");
			System.out.println("5.  Display All Employees");
			System.out.println("0.  Exit");
			System.out.println("-------------------------");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:{
				System.out.print("Enter Employee ID: ");
				int id = sc.nextInt();

				// Check whether the entered ID already exists
				boolean found = false;

				for (Employee e : list) {
					if (e.e_id == id) {
						found = true;
						break;
					}
				}

				// Do not allow duplicate employee IDs
				if (found) {
					System.out.println("Employee ID already exists.");
				} else {
					// Consume the newline left by nextInt()
					sc.nextLine();

					System.out.print("Enter Name: ");
					String name = sc.nextLine();

					System.out.print("Enter Gender: ");
					String gender = sc.nextLine();

					System.out.print("Enter Salary: ");
					float salary = sc.nextFloat();

					// Create an Employee object
					Employee e = new Employee(id, name, gender, salary);

					// Insert the employee at the end
					list.addLast(e);

					System.out.println("Employee added successfully.");
				}

				break;
			}
			case 2:{
				System.out.print("Enter Employee ID to search: ");
				int id = sc.nextInt();

				boolean found = false;

				// Traverse the list to search for the employee
				for (Employee e : list) {

					// Compare the current employee ID
					if (e.e_id == id) {

						// Display details if the ID matches
						e.display_employee();

						found = true;
						break;
					}
				}

				// Display this message if no match was found
				if (!found) {
					System.out.println("Employee not found.");
				}
				break;
			}
			case 3:{
				System.out.print("Enter Employee ID to delete: ");
				int id = sc.nextInt();

				boolean found = false;

				// Search for the employee to be deleted
				for (Employee e : list) {

					if (e.e_id == id) {

						// Remove the matching Employee object
						// and immediately stop traversing
						list.remove(e);

						found = true;
						break;
					}
				}

				// Display the result of deletion
				if (found) {
					System.out.println("Employee deleted successfully.");
				} else {
					System.out.println("Employee not found.");
				}
				break;
			}
			case 4: {
				System.out.print("Enter Employee ID to update: ");
				int id = sc.nextInt();

				boolean found = false;

				// Find the employee using the employee ID
				for (Employee e : list) {

					if (e.e_id == id) {

						// Consume the newline before reading strings
						sc.nextLine();

						// Update the existing object's data members
						System.out.print("Enter New Name: ");
						e.name = sc.nextLine();

						System.out.print("Enter New Gender: ");
						e.gender = sc.nextLine();

						System.out.print("Enter New Salary: ");
						e.salary = sc.nextFloat();

						// Employee ID remains unchanged
						System.out.println("Employee updated successfully.");

						found = true;
						break;
					}
				}
					break;
			}
			case 5: {

				// Check whether the list contains any employees
				if (list.isEmpty()) {
					System.out.println("No employees available.");
				} else {

					// Visit every Employee object in the list
					for (Employee e : list) {

						// Display the current employee's details
						e.display_employee();

						System.out.println("-------------------------");
					}
				}
				break;
			}
			case 0:
				System.out.println("Exiting Employee Management System.");
				break;

			// =====================================
			// INVALID MENU OPTION
			// =====================================
			default:
				System.out.println("Invalid choice. Please try again.");
			}

		} while (choice != 0);
	}

}
