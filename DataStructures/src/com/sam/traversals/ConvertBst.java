package com.sam.traversals;

import com.sam.util.BinaryTreeNode;
import com.sam.util.Node;

public class ConvertBst{
	
	public static BinaryTreeNode firstLeaf = null;
	public 	static BinaryTreeNode prevLeaf = null;
	
	public static void printBST(BinaryTreeNode root){
		//Inorder
		
		if(root == null){
			//System.out.println("Empty");
			return;
		}
		
		printBST(root.getLeft());
		System.out.println(root.getData());
		printBST(root.getRight());
		
	}
	
	public static BinaryTreeNode convertBST(BinaryTreeNode root){
		if( (root.getLeft() == null) &&(root.getRight()==null) ){
			//Its a leaf node
			if(firstLeaf == null)
				firstLeaf = root;
			if(prevLeaf == null){
				prevLeaf = root;
			}
			else{
				prevLeaf.setRight(root);
			
				prevLeaf = root;
			}
			return root;
		}
		else{
			if(root.getLeft() != null){
				convertBST(root.getLeft());
				root.getLeft().setLeft(root);
				root.getLeft().setRight(null);
				root.setLeft(null);
			}
			if(root.getRight() != null){
				convertBST(root.getRight());
				root.getRight().setLeft(root);
				root.getRight().setRight(null);
				root.setRight(null);
			}
			return root;
		}
		
	}

	
	public static void main(String[] args){
		BinaryTreeNode root = new BinaryTreeNode(7);
		root.setLeft(new BinaryTreeNode(5));
		root.setRight(new BinaryTreeNode(9));
		root.getLeft().setLeft(new BinaryTreeNode(4));
		root.getLeft().setRight(new BinaryTreeNode(6));
		root.getRight().setLeft(new BinaryTreeNode(10));
		System.out.println("Inorder Tree Traversal");
		printBST(root);
		convertBST(root);
		System.out.println("Converting BST");
		BinaryTreeNode rnode = firstLeaf;
		while(rnode != null){
			BinaryTreeNode temp = rnode;
			while(temp.getLeft() != null){
				System.out.println(temp.getData()+"  ->  "+temp.getLeft().getData());
				temp = temp.getLeft();
			}
			rnode = rnode.getRight();
		}
		
	}
}