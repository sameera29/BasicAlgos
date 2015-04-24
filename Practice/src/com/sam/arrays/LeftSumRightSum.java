package com.sam.arrays;

public class LeftSumRightSum{
	public static int[] a = {-1,100,1,98,1};
	
	public static void findIndex(){
		int lt = 0;
		int rt = 0;
		
		for(int i=1;i<a.length;i++)
			rt = rt+a[i];
		
		for(int j=1;j<a.length-1;j++){
			if((lt+a[j-1] )== rt-a[j])
				System.out.println("ANSWER: "+j);
			else{
				lt= lt+a[j-1];
				rt = rt - a[j];
			}
				
		}
		
	}
	public static void main(String[] args){
		findIndex();
	}
}