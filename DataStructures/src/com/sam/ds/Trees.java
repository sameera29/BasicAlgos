package com.sam.ds;

import java.util.ArrayList;

public class Trees{
	static class Node{
		int data;
		ArrayList<Node> child = new ArrayList<Node>();
		int ind;
		
	}
	static Node root = new Node();
	
	public static void initialize(int data){
		root.data = data;
		
	}
	
	public static void add(int data,Node parent){
		Node newNode = new Node();
		newNode.data = data;
		parent.child.add(newNode);
		
	
		
	}
	
	public static void main(String args[]){
		initialize(1);
		add(2,root);
		add(3,root);
		add(4,root);
		//display all the children of root
		for(Node nd : root.child){
			System.out.println(nd.data+"  ");
		}
	}
}