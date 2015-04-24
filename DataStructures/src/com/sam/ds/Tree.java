package com.sam.ds;

public class Tree{
	static class Node{
		int data;
		Node lch;
		Node rch;
		
		Node(){
			lch = null;
			rch = null;
		}
	};
	
	public static Node root;
	
	public static void addNode(int data,Node parent, int subtree){
		Node newNode = new Node();
		newNode.data = data;
		//If the parameter subtree =0 then root, 1 then  left child, 2 then right child
		switch(subtree){

		case 0:
			parent.lch = newNode;
			break;
		case 1: 
			parent.rch = newNode;
			break;
		}

	}
	
	public static void initializeRoot(int data){
		
		Node newNode = new Node();
		newNode.data = data;
		root = newNode;
		
	}
	
	public static void inorder(Node root){
		Node cur = root;
		if(cur!=null){
			inorder(cur.lch);
			System.out.println(cur.data+"  ");
			inorder(cur.rch);
		}
	}
	public static void main(String args[]){
		initializeRoot(1);
		//System.out.println(root.data);
		addNode(2,root,0);
		addNode(3,root,1);
	    //System.out.println(root.data);
	    //System.out.println(root.lch.data);
	    //System.out.println(root.rch.data);
	    addNode(4,root.lch,0);
	    addNode(5,root.lch,1);
	    addNode(6,root.rch,0);
	    addNode(7,root.rch,1);
	    inorder(root);
	}
}