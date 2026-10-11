package com.TreeExamples;

public class TreeClass {
	Node root;
	
	//Insert into Tree
	void insert(Node r,Node n) {
		if(root==null) {
			root=n;
		}
		else {
			if(n.data<r.data) {
				if(r.left==null) {
					r.left=n;
				}else {
					insert(r.left,n);
				}
			}
			else{

				if(r.right==null) {
					r.right=n;
				}else {
					insert(r.right,n);
				}

			}
		}

	}
	//InOrder Tree
	void inorder(Node r) {//LPR
		if(r!=null) {
			inorder(r.left);
			System.out.print(r.data+",");
			inorder(r.right);
		}
	}
	//PostOrder Tree
	void postOrder(Node r) {//LRP
		if(r!=null) {
			postOrder(r.left);
			postOrder(r.right);
			System.out.print(r.data+",");
		}
	}
	//PreOrder Tree
	void preOrder(Node r) {//PLR
		if(r!=null) {
			System.out.print(r.data+",");
			preOrder(r.left);
			preOrder(r.right);
		}
	}
	//Total nodes of tree
	int count_node(Node r) {
		if(r==null) {
			return 0;
		}else {
			return 1+count_node(r.left)+count_node(r.right);
		}
	}
	//Total leaf node of tree
	int count_leaf_node(Node r) {
		if(r==null) {
			return 0;
		}
		if(r.left==null&&r.right==null) {
			return 1;
		}
		else {
			return count_leaf_node(r.left)+count_leaf_node(r.right);
		}
	}
	//Total depth of tree
	int count_depth(Node r) {
		if(r==null) {
			return 0;
		}
		if(r.left==null&&r.right==null) {
			return 0;
		}
		else {
			return Math.max(1+count_depth(r.left),1+count_depth(r.right));
		}
	}
	
	public static void main(String [] args) {
		TreeClass obj=new TreeClass();

		obj.insert(obj.root,new Node(5));
		obj.insert(obj.root,new Node(10));
		obj.insert(obj.root,new Node(20));
		obj.insert(obj.root,new Node(15));
		obj.insert(obj.root,new Node(30));
		System.out.print("\nInorder:");
		obj.inorder(obj.root);
		System.out.print("\nPreorder:");
		obj.preOrder(obj.root);
		System.out.print("\nPostorder:");
		obj.postOrder(obj.root);
		System.out.print("\nTotal nodes in tree are:");
		System.out.println(obj.count_node(obj.root));
		System.out.print("\nTotal leaf nodes in tree are:");
		System.out.println(obj.count_leaf_node(obj.root));
		System.out.print("\nTotal depth of tree is:");
		System.out.println(obj.count_depth(obj.root));

	}
}
