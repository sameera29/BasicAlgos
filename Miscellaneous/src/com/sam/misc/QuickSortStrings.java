package com.sam.misc;

public class QuickSortStrings{
	public static String[] s = {"cat", "star", "act", "god", "arts", 
							"dog", "rats"};
	
	public static void swap(int i, int j){
		String temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
	
	public static int partition(int l, int h){
		int pivot;
		int i = l, j=h;
		if(l== h){
			return l;
		}
		if(l+1 == h){
			if(s[l].compareTo(s[h]) > 0){
				swap(l,h);
				return l;
			}
			else{
				return l;
			}
		}
		pivot = (h-l)/2;
		
		while(i<j){
			while( (s[i].compareTo(s[pivot])<0) && (i<j)){
				i++;
			}
			while( (s[j].compareTo(s[pivot])>0) && (i<j)){
				j--;
			}
			swap(i,j);
		}
		return pivot;
		
		
		
	}
	public static void main(String[] args){
		int i;
		System.out.println("Original array");
		for(i=0;i<s.length;i++){
			System.out.println(s[i]+"  ");
		}
		int pivot = partition(0,s.length-1);
		partition(0,pivot -1);
		partition(pivot+1,s.length-1);
		System.out.println("After sorting, array");
		for(i=0;i<s.length;i++){
			System.out.println(s[i]+"  ");
		}
	}
		
	
}