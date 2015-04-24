package com.sam.misc;


public class Sqrt{
	
	public static void main(String[] args){
		double s = sqrt(225);
		System.out.println(s);
		
	}
	
	public static double sqrt(double n){
		if(n == 0)
			return 0;
		double g;
		double sq = n/2;
		do{
			g = sq;
			sq = (g+(n/g))/2;
		}while((g-sq)!=0 );
		return sq;
	}
}