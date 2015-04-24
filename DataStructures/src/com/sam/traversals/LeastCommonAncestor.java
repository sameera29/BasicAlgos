package com.sam.traversals;

import com.sam.util.BinaryTreeNode;

public class LeastCommonAncestor{
	public static BinaryTreeNode root = new BinaryTreeNode(1);
	
	public static void createTree(){
		root.setData(1);
		root.setLeft(new BinaryTreeNode(2));
		root.setRight(new BinaryTreeNode(3));
		root.getLeft().setLeft(new BinaryTreeNode(4));
		root.getLeft().setRight(new BinaryTreeNode(5));
		root.getRight().setLeft(new BinaryTreeNode(6));
		root.getLeft().getLeft().setLeft(new BinaryTreeNode(7));
		root.getLeft().getLeft().setRight(new BinaryTreeNode(8));
		
	}
	public static void printTree(BinaryTreeNode root){
		//Inorder
		
		if(root == null){
			//System.out.println("Empty");
			return;
		}
		
		printTree(root.getLeft());
		System.out.println(root.getData());
		printTree(root.getRight());
		
	}
	
	public static BinaryTreeNode commonAncestor(BinaryTreeNode root,BinaryTreeNode a, 
			BinaryTreeNode b){
		if(root == null)
			return root;
		if( (root.getData() == a.getData()) || (root.getData() == b.getData()))
			return root;
		
	
		BinaryTreeNode left = commonAncestor(root.getLeft(),a,b);
		BinaryTreeNode right = commonAncestor(root.getRight(),a,b);
		
		if (  (left != null && right!= null) &&
		
		( ((left.getData() == a.getData()) && (right.getData() == b.getData())) 
				|| (  (left.getData() == b.getData()) && (right.getData() == a.getData()) ))    ){
			return root;
		
		}
		else if (left == null){
			return right;		
		}
		else
			return left;
		
	}
	
	public static void main(String[] args){
		createTree();
		printTree(root);
		BinaryTreeNode anc = commonAncestor(root,new BinaryTreeNode(7), new BinaryTreeNode(5));
		System.out.println("The Least common ancestor is : "+anc.getData());
	}
	
	
	
}