package com.sam.traversals;

import java.util.ArrayDeque;
import java.util.Deque;

import com.sam.util.*;

public class Dfs{
	public static BinaryTreeNode root = new BinaryTreeNode(1);
	
	public static void createTree(){
		//root.setData(1);
		BinaryTreeNode node = new BinaryTreeNode(2);
		root.setLeft(node);
		root.setRight(new BinaryTreeNode(3));
		root.getLeft().setLeft(new BinaryTreeNode(4));
		root.getLeft().setRight(new BinaryTreeNode(5));
		
	}
	public static void dfsTraversal(BinaryTreeNode node){
		if(node == null){
			return ;
		}
		System.out.println(node.getData());
		dfsTraversal(node.getLeft());
		dfsTraversal(node.getRight());
	}
	
	public static void dfsNonRec(BinaryTreeNode root){
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		if(root == null)
			return;
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
	
	public static void javaStack(){
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(10);
		stack.push(120);
		stack.push(30);
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
	
	public static void main(String [] args){
		createTree();
		dfsTraversal(root);
		//dfsNonRec(root);
		//javaStack();
	}
}

