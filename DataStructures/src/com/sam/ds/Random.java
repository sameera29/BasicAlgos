package com.sam.ds;

import java.util.Arrays;

public class Random{
	public static void main(String Args[]){
		int a[] = {-3,-2,0,1,1,3,4,5,8};
		Arrays.sort(a);
		int ct = 0;
		int i =0;
		int j=a.length-1;
		int k = 6;
		while((i<a.length)&&(j>=0)){
			if((a[i]+a[j]==k)&&(i!=j)){
				ct++;
				
				System.out.println(a[i]+"  "+a[j]);
				i++;
			}
			else if((a[i]+a[j]>k)){
				j--;
			}
			else if((a[i]+a[j]<k)){
				i++;
			}
		}
		System.out.println(ct);
	}
}