package com.sam.misc;

public class MaxSubarray{
	public static int[] a = {4,-6,12,3,15};
	
	public static void maxSubArray(){
		int i=0, n= a.length;
		int max_l,max_h;
		int j,sum;
		if(a[i]<0)
			sum =0;
		else
			sum = a[i];
		int max =sum;
		max_l=max_h=0;
		
		j=i+1;
		while(j<n){
			sum = sum+a[j];
			if(sum<0){
				sum = 0;
				j++;
				i=j;
			}
			else{
				if(max < sum){
					max = sum;
					max_h = j;
					max_l = i;
				}
				j++;
			}
		}
		System.out.println("Maximum sum: "+max+" From  "+max_l+"  To  "+max_h);
	}
	
	public static void main(String[] args){
		maxSubArray();
	}
}