package com.sam.traversals;

import java.util.ArrayList;

import com.sam.util.BinaryTreeNode;


public class LevelTraversal{
	public static BinaryTreeNode root = new BinaryTreeNode();
	
	public static void createTree(){
		root.setData(1);
		root.setLeft(new BinaryTreeNode(2));
		root.setRight(new BinaryTreeNode(3));
		root.getLeft().setLeft(new BinaryTreeNode(4));
		root.getLeft().setRight(new BinaryTreeNode(5));
		root.getRight().setLeft(new BinaryTreeNode(6));
		root.getRight().setRight(new BinaryTreeNode(7));
		
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
	
	public static void printLevelOrder(BinaryTreeNode root){
		ArrayList<BinaryTreeNode> tree = new ArrayList<BinaryTreeNode>(10);
		int n = 0,l;
		int i=0;
		tree.add(i,root);
		for(i = 0; i<=n;i++){
			BinaryTreeNode node = tree.get(i);
			if(node.getLeft() != null){
				tree.add(node.getLeft());
				n= 2*i+1;
			}
			if(node.getRight() != null){
				tree.add(node.getRight());
				n= 2*i+2;
			}
		}
		//Print level wise
		l=(n/2);
		if(n%2 !=0)
			l++;
		
		for(int k = l;k>=1;k--){
			int j =(int) Math.pow(2,k-1)-1;
			int m =(int) Math.pow(2,k)-1;
			System.out.println("Next Level");
			while(j< m){
				System.out.println(tree.get(j).getData()+" ");
				j++;
			}
			
		}
		
	}
	public static void main(String args[]){
		createTree();
		System.out.println("Inorder");
		printTree(root);
		System.out.println("Level order");
		printLevelOrder(root);
		
		
		
	}
}