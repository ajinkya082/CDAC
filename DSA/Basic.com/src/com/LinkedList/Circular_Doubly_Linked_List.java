package com.LinkedList;

public class Circular_Doubly_Linked_List {
	Dnode root, last; // first and last node

	// Insert Left
	void insert_left(int data)
	{
		Dnode n = new Dnode(data);

		if (root == null)
		{
			root = n;
			last = n;

			root.left = last;
			last.right = root;
		}
		else
		{
			n.right = root;
			n.left = last;

			root.left = n;
			last.right = n;

			root = n;
		}
	}

	// Insert Right
	void insert_right(int data)
	{
		Dnode n = new Dnode(data);

		if (root == null)
		{
			root = n;
			last = n;

			root.left = last;
			last.right = root;
		}
		else
		{
			n.left = last;
			n.right = root;

			last.right = n;
			root.left = n;

			last = n;
		}
	}

	// Delete Left
	void delete_left()
	{
		if (root == null)
			System.out.print("\nEmpty List");
		else
		{
			Dnode t = root;

			if (root == last)
			{
				root = _____;
				last = _____;
			}
			else
			{
				root = root._____;

				root.left = _____;
				last.right = _____;
			}

			System.out.print("\n" + t.data + " deleted");
		}
	}

	// Delete Right
	void delete_right()
	{
		if (root == null)
			System.out.print("\nEmpty List");
		else
		{
			Dnode t = _____;

			if (root == last)
			{
				root = _____;
				last = _____;
			}
			else
			{
				last = last._____;

				last.right = _____;
				root.left = _____;
			}

			System.out.print("\n" + t.data + " deleted");
		}
	}

	// Print Forward
	void print_list()
	{
		if (root == null)
			System.out.print("\nList Empty");
		else
		{
			Dnode t = _____;
			System.out.print("NULL <-> ");

			do
			{
				System.out.print(t.data + " <-> ");
				t = t._____;
			}
			while (t != _____);

			System.out.print("ROOT");
		}
	}

	// Print Reverse
	void print_list_rev()
	{
		if (root == null)
			System.out.print("\nList Empty");
		else
		{
			Dnode t = _____;
			System.out.print("NULL <-> ");

			do
			{
				System.out.print(t.data + " <-> ");
				t = t._____;
			}
			while (t != _____);

			System.out.print("LAST");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Circular_Doubly_Linked_List obj =
				new Circular_Doubly_Linked_List();

		int choice, data;

		do
		{
			System.out.print("\n\n===== Circular Doubly Linked List =====");
			System.out.print("\n1. Insert Left");
			System.out.print("\n2. Insert Right");
			System.out.print("\n3. Delete Left");
			System.out.print("\n4. Delete Right");
			System.out.print("\n5. Print Forward");
			System.out.print("\n6. Print Reverse");
			System.out.print("\n0. Exit");
			System.out.print("\nEnter choice: ");

			choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				System.out.print("Enter data: ");
				data = sc.nextInt();
				obj.insert_left(data);
				break;

			case 2:
				System.out.print("Enter data: ");
				data = sc.nextInt();
				obj.insert_right(data);
				break;

			case 3:
				obj.delete_left();
				break;

			case 4:
				obj.delete_right();
				break;

			case 5:
				obj.print_list();
				break;

			case 6:
				obj.print_list_rev();
				break;

			case 0:
				System.out.print("\nExiting...");
				break;

			default:
				System.out.print("\nInvalid choice");
			}

		} while (choice != 0);

		sc.close();
	}

}
