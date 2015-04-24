package com.sam.arrays;

public class LongestSubarray{
	public static int[] arr = {0,0,1,0,1,0,1,0};
	
	public static void findLongest(){
		int zeroes = 0, ones = 0,i,j;
		for(i = 0;i<arr.length;i++){
			if(arr[i]== 0)
				zeroes++;
			else
				ones++;
		}
		
		i=0;
		j=arr.length-1;
		while(i<j){
			if(zeroes == ones)
				break;
			if(ones > zeroes){
				if(arr[i]==1){
					i++;
					ones--;
				}
				else if(arr[j]== 1){
					j--;
					ones--;
				}
				else{
					i++;
					zeroes--;
				}
			}
			else{
				if(arr[i]==0){
					i++;
					zeroes--;
				}
				else if(arr[j] == 0){
					j--;
					zeroes--;
				}
				else{
					j--;
					ones--;
				}
					
			}
		}
		for(int k=i;k<=j;k++){
			System.out.println(arr[k]);
		}
		
	}
	
	public static void main(String[] args){
		findLongest();
	}
}