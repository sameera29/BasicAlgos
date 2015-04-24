package com.sam.misc;


public class BinarySearch{
	
	
	public static void main(String[] args){
		int[] a = { 4,8,15,19,25,27,43,60};
		
		bsearch(a,0,7,43);

	}
	
	public static void bsearch(int[] a, int l, int h, int x){
		
		if(l<=h){
			int mid = (l+h)/2;
			if(x == a[mid]){
				System.out.println(" Found element at : "+mid);
				return;
			}
			else{
				if( x<a[mid] ){
					h = mid-1;
					bsearch(a,l,h,x);
				}
				else{
					l = mid+1;
					bsearch(a,l,h,x);
				}
				return;
			}
		}
		else{
			return;
		}
	}
}