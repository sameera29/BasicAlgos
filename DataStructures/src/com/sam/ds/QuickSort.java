package com.sam.ds;

public class QuickSort{
	public static int [] a = {5,7,3};//,19,1,8};
	
	public static void swap(int [] a,int i, int j){
		Object temp = a[i];
		a[i] = a[j];
		a[j] = (Integer) temp;
		
	}
	
	public static void partition(int[] a,int l, int h){
		System.out.println("Partition sorting ");
		for (int i =0; i<a.length;i ++){
			System.out.println(a[i]+" ");
		}
		int pivot,i,j,p;
		i= l;
		j= h;
		if(l==h){
			return ;
		}
		if(l == h-1){
			if(a[h] < a[l]){
				swap (a,l,h);
			}
			return ;
		}
		p = (h+l)/2;
		pivot = a[p];
		while (i<=j){
			while( (a[i]<= pivot) /*&& (i<j)*/){
				i++;
				if(i>=h)
					break;
			}
			
			while( (a[j] > pivot) /*&& (i<j)*/){
				j--;
				if(j<=l)
					break;
			}
			if(i<=j){
				swap(a,i,j);
				i++;
				j--;
			}
		}
		if(l<j)
			partition(a,l,j);
		if(i<h)
			partition(a,i,h);

		System.out.println("After sorting ");
		for (int k=0; k<a.length;k++){
			System.out.println(a[k]+" ");
		}
	}
	public static void main(String[] args){
		System.out.println("Before sorting ");
		for (int i =0; i<a.length;i ++){
			System.out.println(a[i]+" ");
		}
		partition(a,0,a.length-1);
		
	}
}