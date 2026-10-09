package com.LinkedList;

public class Circular_Linked_List {
	Node root,last;//Only Node, which you know and you will record
	//insert left
	void insert_left(int data)
	{
		Node n=new Node(data);
		if(root==null)//on first
		{
			root=n;
			last=n;
		}
		else
		{
			n.next=root;//1
			root=n;//2
		}
		last.next=root;//3
	}
	//insert right
	void insert_right(int data)
	{
		Node n=new Node(data);
		if(root==null)//on first
		{last=root=n;}
		else
		{
			last.next=n;
			last=n;
		}
		last.next=root;
	}

	//    delete left
	void delete_left()
	{
		if(root==null)//on first
			System.out.print("\nEmpty list");
		else 
		{
			Node t=root;//1
			if(root==last) {
				root=last=null;
			}
			else {
				root=root.next;//2
				last.next=root;
			}
			System.out.print("\nDeleted:"+t.data);
		}

	}
	//delete right
	void delete_right()
	{
		if(root==null)//on first
			System.out.print("\nEmpty list");
		else
		{
			Node t2=root;//1
			Node t=root;//1

			while(t!=last)//2
			{
				t2=t;//tail method as we can not go back we would wait 1 step back
				t=t.next;
			}
			if(root.next==null)//single node
				root=null;//self delete
			else
				t2.next=root;//use tail to delete second last to last connectivity
				last=t2;
			System.out.print("\nDeleted:"+t.data);
		}
	}
	void print_list()
	{
		if(root==null)//on first
			System.out.print("\nEmpty list");
		else
		{
			Node t=root;//1
			System.out.print("Element are\n");
			do//2
			{
				System.out.print("|"+ t.data+"|->");
				t=t.next;
			}while(t!=root);
			
		}

	}
	boolean search_list(int key)
	{
		if(root==null)//on first
			System.out.print("\nEmpty list");
		else
		{
			Node t=root;//1
			while(t!=null)//2
			{
				if(t.data==key)
					return true;
				t=t.next;
			}
		}
		return false;

	}
	void insert_after(int ref,int data)
	//Will search for the given reference element and if found will insert a node after that reference.
	{
		if(root==null)//on first
			System.out.print("\nEmpty list");
		else
		{
			Node t=root;//1
			while(t!=null)//2
			{
				if(t.data==ref)//if found
				{
					Node n=new Node(data);//create
					n.next=t.next;//link to t.next
					t.next=n;//let t ref n as next
					return;
				}
				t=t.next;
			}
			System.out.print("\n"+ref+" Not found");
		}
	}
	void delete_element(int element)
	//This method will search and delete the number if found.
	{
		if(root==null)//on first
			System.out.print("\nEmpty list");
		else
		{
			Node t=root;//1
			Node t2=root;//1
			while(t!=null)//2
			{
				if(t.data==element)//if found
				{
					//cases
					if(t==root)//case 1
						root=root.next;//move root ahead
					else if (t.next==null)//case 2
						t2.next=null;//cut link from last
					else
						t2.next=t.next;
					System.out.print("\n"+t.data+" deleted");
					return;
				}
				t2=t;
				t=t.next;
			}
			System.out.print("\n"+element+" Not found");
		}

	}

}
