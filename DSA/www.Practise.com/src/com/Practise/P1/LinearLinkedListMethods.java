package com.Practise.P1;

public class LinearLinkedListMethods {
	Node root;
	void insert_left(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
		}else {
			n.next=root;
			root=n;
		}
	}
	void insert_right(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
		}else {
			Node t=root;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=n;
		}
	}
	void delete_left() {
		if(root==null) {
			System.out.println("Empty List");
		}else {
			Node t=root;
			root=root.next;
			System.out.println("Deleted element: "+t.data);
		}
	}
	void delete_right() {
		if(root==null) {
			System.out.println("Empty List");
		}else {
			Node t=root;
			Node t2=root;
			while(t.next!=null) {
				t2=t;
				t=t.next;
			}
			if(root.next==null) {
				root=null;
			}else {
				t2.next=null;
			}
			System.out.println("Deleted element: "+t.data);
		}
	}
	void insert_after(int ref,int data) {
		if(root==null) {
			System.out.println("Empty List");
		}else {
			Node t=root;
			while(t!=null) {
				if(t.data==ref) {
					Node n=new Node(data);
					n.next=t.next;
					t.next=n;
					return;
				}
				t=t.next;
			}
			System.out.println(ref+"Not Found");
		}
	}
	boolean search_list(int key)
	{
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node t=root;
			while(t!=null) {
				if(t.data==key) {
					return true;
				}
				t=t.next;
			}
		}
		return false;
	}
	void print() {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node t=root;
			System.out.print("\nElements are:");
			while(t!=null) {
				System.out.print("|"+t.data+"->|");
				t=t.next;
			}
		}
	}
}
