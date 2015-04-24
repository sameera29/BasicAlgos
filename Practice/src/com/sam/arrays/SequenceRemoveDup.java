package com.sam.arrays;

public class SequenceRemoveDup{
	//public static String s = "RGBBGRY";
	public static String s = "YRGGRRGGRY";
	
	public static void removeDups(){
		int top = -1;
		int count = 0;
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++){
			if(top == -1){
				top = i;
			}
			else{
				if(a[i] == a[top]){
					top--;
					count++;
					continue;
				}
				else{
					top++;
				}
			}
		}
		System.out.println("Max Count is:"+count);
	}
	
	public static void main(String[] args){
		removeDups();
	}
}