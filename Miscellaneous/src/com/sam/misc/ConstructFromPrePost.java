package com.sam.misc;



public class ConstructFromPrePost{
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
	
	public static int[] pre = {1, 2, 4, 8, 9, 5, 3, 6, 7}; 
	public static int[] post = {8, 9, 4, 5, 2, 6, 7, 3, 1};
	public static int preInd =0;


	
	public static Node buildTree(int[] pre, int[] post,
			 int l, int h, int n){
		int postInd=0;
		//System.out.println(preInd);
		if( (preInd > n) || (l>h)){
			return null;
		}
		Node root = new Node(pre[preInd]);
		preInd ++;
		if ((l==h) || preInd >n)
			return root;
		
		int i;
		for ( i=l;i<=h;i++){
			if(pre[preInd] == post[i]){
				postInd = i;
				break;
			}
		}
		
		if(i<=h){
			root.left = buildTree(pre,post,l,i,n);
			root.right = buildTree(pre,post,i+1,h,n);
			
		}		
		return root;
	}
	public static void inorder(Node root){
		if(root != null){
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	public static void main(String[] args){
		int n = pre.length;
		System.out.println("Length "+n);
		Node root = buildTree(pre,post,0,n-1,n-1);
		inorder(root);
	}
}