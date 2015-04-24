package com.sam.ds;

public class MaxSubSeqPalindrome{
	
	public static void main(String[] args){
		
		int[] a = {4,1,2,3,4,5,6,5,4,3,4,4,4,4,4,4,4,4};
		
		maxSubSeqPalindrome(a);
	}
	
	public static void maxSubSeqPalindrome(int[] a){
		int[] pal1 = {};
		int[] pal2 = {};
		int[] pal = {};
		
		for(int i=0;i<a.length;i++){
			pal1 = expand(a,i,i);
			if(pal.length < pal1.length){
				pal = pal1;
			}
		}
		
		for(int i=0;i<a.length;i++){
			pal2 = expand(a,i,i+1);
			if(pal.length < pal2.length){
				pal = pal2;
			}
		}
		
		
		System.out.println("Maximum subsequence palindrome is: "+pal.length);
		printPalindrome(pal);
	}
	
	public static int[] expand(int[] a, int x, int y) {
		
		while( (x>=0) && (y<=a.length-1) && (a[x]==a[y])  ){
			x--;
			y++;
		}
		int[] b = new int[y-x-1];
		int k = 0;
		for(  int j =x+1;j<y;j++){
			b[k] = a[j];
			k++;
		}
		return b;
	}
	public static void printPalindrome(int[] pal){
		for (int i=0;i<pal.length;i++){
			System.out.print(pal[i]+" ");
		}
	}
	
}