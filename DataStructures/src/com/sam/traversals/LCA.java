package com.sam.traversals;

import com.sam.util.*;

public class LCA{
	public static BinaryTreeNode root = new BinaryTreeNode();
	
	public static void createTree(){
		root.setData(20);
		root.setLeft(new BinaryTreeNode(8));
		root.setRight(new BinaryTreeNode(22));
		root.getLeft().setLeft(new BinaryTreeNode(4));
		root.getLeft().setRight(new BinaryTreeNode(12));
		root.getLeft().getRight().setLeft(new BinaryTreeNode(10));
		root.getLeft().getRight().setRight(new BinaryTreeNode(14));
		
		
	}
	
	public static BinaryTreeNode findLca(BinaryTreeNode root,BinaryTreeNode x, BinaryTreeNode y){
		if(root == null){
			return root;
		}
		if( (root.getData() == x.getData()) || (root.getData() == y.getData())){
			return root;
		}
		else{
			BinaryTreeNode left = findLca(root.getLeft(),x,y);
			BinaryTreeNode right = findLca(root.getRight(),x,y);
		
				if((left != null) && (right != null) && ( ((left.getData() == x.getData()) &&(right.getData() == y.getData())) || ((left.getData() ==y.getData()) && (right.getData() == x.getData())) )){
					return root;
				}
			
			else{
				if(left != null)
					return left;
				else
					return right;
					
			}
		}
	
	}
	
	public static void main(String[] args){
		createTree();
		BinaryTreeNode n = findLca(root,new BinaryTreeNode(4), new BinaryTreeNode(14));
		System.out.println("LCA: "+n.getData());
	}
	
}