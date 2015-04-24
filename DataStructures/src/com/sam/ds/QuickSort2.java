package com.sam.ds;

public class QuickSort2{
	public static int[] a = {5,7,3,4};
	public static int[] swap(int[] ar,int i, int j){
		int temp;
		temp = ar[i];
		ar[i]=ar[j];
		ar[j] =temp;
		return ar;
	}
	
	public static int partition(int ar[], int l, int h){
		int i = l,j=h;
		int p = (l+h)/2;
		int pivot = ar[p];
		System.out.println("Pivot: "+pivot);
		
		while(i<j){
			while((i<=j) && (ar[i] <= pivot)){
				i++;
				System.out.println("i: "+i+"  j:"+j);
			}
			while((i<=j) && (ar[j] > pivot) ){
				j--;
				System.out.println("i: "+i+"  j:"+j);
			}
			if(i<=j){
				ar = swap(ar,i,j);
			}
		}
		return i;
	}
	
	public static void qs(int[] ar,int l, int h){
		System.out.println("In QS l,h: "+l+"  "+h);
		int p = partition(ar,l,h);
		if(l<=p-1){
			qs(ar,l,p-1);
		}
		if(h>p+1)
			qs(ar,p+1,h);



		System.out.println("After sorting ");
		for (int i=0; i<ar.length;i++){
			System.out.println(ar[i]+" ");
		}
	}
	
	public static void main(String[] args){
		System.out.println("Before sorting ");
		for (int i=0; i<a.length;i++){
			System.out.println(a[i]+" ");
		}
		qs(a,0,a.length-1);
	}
}