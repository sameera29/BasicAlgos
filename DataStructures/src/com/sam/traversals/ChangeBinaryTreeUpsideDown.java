package com.sam.traversals;

import com.sam.util.*;

public class ChangeBinaryTreeUpsideDown{
	public static BinaryTreeNode root = new BinaryTreeNode(1);
	
	public static void initializeTree(){
		root.setLeft(new BinaryTreeNode(2));
		root.setRight(new BinaryTreeNode(3));
		root.getLeft().setLeft(new BinaryTreeNode(4));
		root.getLeft().setRight(new BinaryTreeNode(5));
		root.getLeft().getLeft().setLeft(new BinaryTreeNode(6));
		root.getLeft().getLeft().setRight(new BinaryTreeNode(7));
	}
	
	public static void printTree(){
		Stack<BinaryTreeNode> s  =new Stack<BinaryTreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			BinaryTreeNode node = s.pop().getDataNode();
			System.out.println(node.getData());
			if(node.getRight() != null)
				s.push(node.getRight());
			if(node.getLeft() != null)
				s.push(node.getLeft());
			
		}
		
	}
	
	public static void changeTree(){
		Stack<BinaryTreeNode> s =  new Stack<BinaryTreeNode>();
		boolean foundRoot = false;
		BinaryTreeNode cur = new BinaryTreeNode();;
		s.push(root);
		while(!s.isEmpty()){
			cur = s.pop().getDataNode();
			if(cur.getLeft() != null){
				s.push(cur);
				s.push(cur.getLeft());
			}
			else{
				
				break;
			}
		}
		
		while(!s.isEmpty()){
			BinaryTreeNode node = s.pop().getDataNode();
			cur.setRight(node);
			cur.setLeft(node.getRight());
			if(foundRoot == false){
				root = cur;
				foundRoot = true;
			}
			cur = cur.getRight();	
			
		}
		cur.setRight(null);
		cur.setLeft(null);
	}
	public static void main(String[] args){
		initializeTree();
		printTree();
		changeTree();
		System.out.println("After changing");
		printTree();
	}
}