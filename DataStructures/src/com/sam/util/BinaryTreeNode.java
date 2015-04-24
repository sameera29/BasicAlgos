package com.sam.util;

public class BinaryTreeNode{
	Object data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode(){
		
	}
	
	public BinaryTreeNode(Object data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	

	
	
	
	
	
}