package com.sam.misc;

public class ModifiedBSearch{
	
	
	public static void main(String[] args){
		int[] a = {4,5,6,1,2,3};
		int x = 1;
		
		findNumber(a,0,5,x);
	}
	
	public static void findNumber(int[] a,int l,int h,int x){
		if(l<=h){
			int mid = (l+h)/2;
			if(a[mid] == x){
				System.out.println("Found element at: "+mid);
				return;
			}
				
			else if( x<a[mid] ){
				if(a[l] <= x){
					h=mid-1;
				}
				else if( x<= a[h]){
					l = mid+1;
				}
				else{
					h = mid -1;
				}
				findNumber(a,l,h,x);
				return;
			}
			else if( x<=a[h]){
				l = mid+1;
			}
			else if( x >= a[l] ){
				h = mid-1;
			}
			else{
				l=mid+1;
			}
			findNumber(a,l,h,x);
			return;
		}
		else{
			return;
		}
		
		
	}

	
}