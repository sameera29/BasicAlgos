package com.sam.misc;


public class CalculatePower{
	
	public static void main(String[] args){
		double n = 0.5;
		int x = 3;
		System.out.println("Power of "+n+" to "+x+" is:  ");
		System.out.println(power(n,x));
	}
	
	public static double power(double n, int x){
		if(x == 0)
			return 1;
		if(x == 1)
			return n;
		if(  x%2 == 0 ){
			double h = power(n,x/2);
			return h*h;
		}
		else{
			double h = power(n,(x-1)/2);
			return n*h*h;
		}
	}
}