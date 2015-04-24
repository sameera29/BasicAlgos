package com.sam.misc;

import com.sam.misc.ConstructFromPrePost.Node;

public class ConstructFromInPost{
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(){
			left = null;
			right = null;
		}
		public Node(int c){
			data = c;
			left = null;
			right = null;
		}
		
	};
	
	public static int[] in = {8, 4, 9, 2, 5, 1, 6, 3, 7}; 
	public static int[] post = {8, 9, 4, 5, 2, 6, 7, 3, 1};
	
	public static Node buildTree(int[] post, int[] in,
			int l, int h, int n){
		if( (h>n) || (l>h)){
			return null;
		}
		Node root = new Node(post[h]);
		if (l==h){
			return root;
		}
		int i ;
		for (i=0;i<=n;i++){
			if(post[h] == in[i])
				break;
		}
		if (i<=h){
			root.left = buildTree(post,in,l,i-1,n);
			root.right = buildTree(post,in,i,h-1,n);
		}
		return root;
	}
	
	public static void preOrder(Node root){
		if(root == null)
			return;
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	public static void main(String[] args){
		int n = post.length-1;
		System.out.println("Length "+(n+1));
		Node root = buildTree(post,in,0,n,n);
		preOrder(root);
	}
	
	
}