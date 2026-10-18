package com.Practise.LinkedList;

public class DoublyLinkedListPr {
	Node root;
	void insert_left(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
			n.prev=null;
			n.next=null;
		}
		else {
			n.next=root;
			root.prev=n;
			root=n;
		}
	}
	//insert right
	void insertRight(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
			n.prev=null;
			n.next=null;
		}
		else {
			Node t=root;
			while(t.next!=null) {
				t=t.next;
			}

			n.prev=t;
			n.next=null;
			t.next=n;
		}
	}
	//delete left
	void deleteLeft() {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node t=root;
			root=root.next;
			if(root!=null) {
				root.prev=null;
			}
			System.out.println("Deleted:"+t.data);
		}
	}
	//delete right
	void deleteRight() {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node t=root;
			Node t2;
			while(t.next!=null) {
				t=t.next;
			}
			t2=t.prev;
			if(root.next==null) {
				root=null;
			}
			else {
				t2.next=null;
			}
			System.out.println("Delted:"+t.data);
		}
	}
	void print() {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node t=root;
			while(t!=null) {
				System.out.print("->|"+t.data+"|");
				t=t.next;
			}
			System.out.print("NULL");
		}
	}
	public static void main(String[]args) {
		DoublyLinkedListPr dl=new DoublyLinkedListPr();
		dl.insert_left(20);
		dl.insertRight(50);
		dl.print();
	}
}
