package com.sam.misc;

import java.util.ArrayList;

public class CommonElement{
	public static int[] a = {1,2,3,4,5,6};
	public static int[] b = {5,6,7,8,9};
	
	public static ArrayList<Integer> findCommon(){
		ArrayList<Integer> r = new ArrayList<Integer>();
		int i=0,j=0;
		
		while( (i<a.length) &&(j<b.length) ){
			if( a[i]==b[j] ){
				r.add(a[i]);
				i++;
				j++;
			}
			else{
				if(a[i]<b[j]){
					i++;
				}
				else
					j++;
			}
		}
		return r;
	}
	
	public static void main(String [] args){
		
		ArrayList<Integer> r = findCommon();
		for( int n : r){
			System.out.println(n);
		}
	}
}