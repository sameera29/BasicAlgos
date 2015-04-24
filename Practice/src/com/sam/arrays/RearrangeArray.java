package com.sam.arrays;

public class RearrangeArray{
	public static int arr[] = {1,2,3,4,5,6,7,8};
	
	public static void swap(int i, int j){
		int c;
		c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}
	public static void rearrange(int l, int h){
		int mid,mid1,mid2;
		int i,j;
		if((h-l)>1){
			mid = (int) Math.ceil((l+h)/2);
			mid1 = (int) Math.ceil((l+mid)/2);
			mid2 =  (int) Math.ceil((mid+1+h)/2);
			for(i=mid1,j=mid+1;(i<=mid)&&(j<=h);i++,j++){
				swap(i,j);
			}
			rearrange(l,mid);
			rearrange(mid+1,h);
			
		}
	}
	
	public static void main(String args[]){
		for(int i =0; i<8;i++){
			System.out.println(arr[i]+"  ");
		}
		rearrange(0,7);
		System.out.println("After ");
		for(int i =0; i<8;i++){
			System.out.println(arr[i]+"  ");
		}
	}
}