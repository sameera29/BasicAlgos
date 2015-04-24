package com.sam.ds;

public class QuickSort3{
	//public static int[] a = {24, 5, 3, 35, 14, 23, 19, 43, 2};  //5,4,3,7
	public static int[] a = {5,7,3,4};
	
	public static void swap(int i, int j){
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static int partition(int l, int h){
		int stInd =l;
		int pivInd = (h+l)/2;
		int pivot = a[pivInd];
		swap(pivInd,h);
		for(int i=l;i<h;i++){
			if(a[i] < pivot){
				swap(stInd,i);
				stInd++;
			}
		}
		
		swap(h,stInd);
	
		return stInd;
	}
	
	public static void qs(int l, int h){
		if( (h-l+1)<=1)
			return;
		
		
		int pivInd = partition(l,h);
		qs(l,pivInd-1);
		qs(pivInd+1,h);
		
	}
	
	public static void main(String[] args){
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("After Sorting");
		qs(0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	}
}