package com.sam.traversals;

import com.sam.util.*;


public class Preorder{
	public static BinaryTreeNode root = new BinaryTreeNode();

	public static void createTree(){
		root.setData(100);
		root.setLeft(new BinaryTreeNode(50));
		root.setRight(new BinaryTreeNode(150));
		root.getLeft().setLeft(new BinaryTreeNode(25));
		root.getLeft().setRight(new BinaryTreeNode(75));
		root.getRight().setLeft(new BinaryTreeNode(125));
		root.getRight().setRight(new BinaryTreeNode(175));
		root.getRight().getLeft().setLeft(new BinaryTreeNode(110));
		
	}
	
	public static void preOrderRec(BinaryTreeNode node){
		if(node == null){
			return;
		}
		System.out.println(node.getData());
		preOrderRec(node.getLeft());
		preOrderRec(node.getRight());
		
		
	}
	
	public static void inOrderRec(BinaryTreeNode node){
		if(node == null){
			return;
		}
		
		inOrderRec(node.getLeft());
		System.out.println(node.getData());
		inOrderRec(node.getRight());
		
		
	}
	
	public static void preOrderNonRec(BinaryTreeNode node){
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		if(node == null)
			return;
		s.push(node);
		while(!s.isEmpty()){
			Node<BinaryTreeNode> nd = s.pop();
			System.out.println(nd.getDataNode().getData());
			if(nd.getDataNode().getRight()!= null)
				s.push(nd.getDataNode().getRight());
			if(nd.getDataNode().getLeft()!= null)
				s.push(nd.getDataNode().getLeft());
		System.out.println("NEXT");
		}
	}
	
	public static void inOrderNonRec(BinaryTreeNode node){
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		BinaryTreeNode temp = null;
		
		if(node == null)
			return;
		
		s.push(node);
		while(!s.isEmpty()){
			Node<BinaryTreeNode> nd = s.pop();
			temp = new BinaryTreeNode(nd.getDataNode().getData());
			
			
			if(nd.getDataNode().getLeft() != null){
				if(nd.getDataNode().getRight() != null){
					 
					s.push(nd.getDataNode().getRight());
					s.push(temp);
					s.push(nd.getDataNode().getLeft());
				}
				else{
					s.push(temp);
					s.push(nd.getDataNode().getLeft());
				}
			}
			else{
				System.out.println(nd.getDataNode().getData());
				if(nd.getDataNode().getRight() != null){
					//temp = node;
					s.push(nd.getDataNode().getRight());
					
				}
			}
			
		}
	}
	
	
	public static void main(String [] args){
		createTree();
		//System.out.println("RECURSIVE");
		//preOrderRec(root);
		//System.out.println("RECURSIVE");
		//inOrderRec(root);
		
		System.out.println("INORDER NON_RECURSIVE");
		inOrderNonRec(root);
	}
}