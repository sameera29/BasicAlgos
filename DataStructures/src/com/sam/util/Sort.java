package com.sam.util;

public class Sort{
	public int[] a;
	
	public Sort(){
		
	}
	public Sort(int[] a){
		this.a = a;
	}
	
	public  int[] quickSort( int l, int h){
		
		if( (h-l+1)<=1)
			return a;
		int pivot = partition(l,h);
		quickSort(l,pivot-1);
		quickSort(pivot+1,h);
		return a;
	}
	
	public void swap(int i, int j){
		int temp  = a[i];
		a[i]=a[j];
		a[j] = temp;
	}
	
	public int partition(int l,int h){
		
		
		int pivotInd = (l+h)/2;
		System.out.println(pivotInd);
		int pivot = a[pivotInd];
		swap(pivotInd,h);
		int stInd = l;
		for (int i=l;i<h-1;i++){
			if(a[i] <pivot){
				swap(stInd,i);
				stInd++;
			}
		}
		swap(stInd,h);
		return stInd;
	}
}