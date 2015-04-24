package com.sam.misc;

/* swap numbers based on a perutation specified. Do it in place */

public class IndexSwap{
	public static int x[] = {17,5,1,9};
	public static int a[] = {3,2,4,1};
	
	public static void main(String[] args){
		int i=0,goingTo,toMove,temp;
	
		for( i =0; i<x.length;i++){
			if(a[i] <0){
				continue;
			}
			goingTo = a[i]-1;
			toMove = x[i];
			System.out.println("GOING TO "+goingTo+" TO MOVE :"+toMove);
			while(goingTo != i){
				temp = x[goingTo];
				x[goingTo] = toMove;
				toMove = temp;
				temp = a[goingTo]-1;
				a[goingTo] = -a[goingTo];
				goingTo = temp;
				System.out.println("INSIDE: "+"GOING TO "+goingTo+" TO MOVE :"+toMove);
			}
			x[i] = toMove;
		}
		
		
		for(int j=0;j<x.length;j++){
			System.out.println(x[j]+" ");
		}
	}
}