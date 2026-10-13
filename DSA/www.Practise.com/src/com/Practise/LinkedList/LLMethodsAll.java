package com.Practise.LinkedList;

public class LLMethodsAll {
	Node root;
	public void insert_left(int data) {
		Node n =new Node(data);
		if(root==null) {
			root=n;
		}else {
			n.next=root;
			root=n;
		}
	}
	public void display() {
		Node t=root;
		while(t!=null) {
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
	public Node deleteN(int n) {
		Node t=root;

		int size=0;
		while(t!=null) {
			size++;
			t=t.next;
		}
		t=root;
		int m=size-n+1;
		for(int i =0;i<m-2;i++) {

			t=t.next;
		}
		t.next=t.next.next;
		return root;
	}
	public int findNth(int index) {
		Node t=root;
		int count=0;
		if(t==null) {
			return -1;
		}

		
		while(t!=null) {
			count++;
			t=t.next;
		}
		t=root;
		int m=count-index+1;
		for(int i=0;i<m-1;i++) {
			t=t.next;
		}
		return t.data;
	}
}
