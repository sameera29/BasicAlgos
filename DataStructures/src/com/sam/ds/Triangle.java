package com.sam.ds;

import com.sam.util.*;

public class Triangle{
	public static void main(String[] args){
		int[] a = { 9,8,10,7};
		Sort s = new Sort(a);
		a = s.quickSort(0,a.length-1);
		System.out.println("The sorted array is: ");
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}