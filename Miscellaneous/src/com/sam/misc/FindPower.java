package com.sam.misc;

public class FindPower{
	public static void main(String[] args){
		int n = 625;
		System.out.println("Answer 1: "+isPowerRep(n));
		//System.out.println("Answer 2: "+isPowerRep2(n));
	}
	public static boolean isPowerRep2(int n){
		for(int i= 2;i<n;i++){
			double temp = Math.log(n)/Math.log(i);
		
			if( Math.ceil(temp) == temp)
				return true;
		}
		return false;
	}
	
	public static boolean isPowerRep(int n){
		if(n ==0 )
			return false;
		if(n == 1)
			return true;
		if(n==2)
			return true;
		int ctr = 0;
		for(int i = 2;i*i <= n;i++){
			ctr++;
			int temp = n;
			while(temp >1){
				if(temp%i !=0)
					break;
				temp = temp/i;
			}
			if(temp == 1){
				System.out.println(n+" is:  "+i+" To the power: "+ctr);
				return true;
			}
		}

		return false;
		
		
			
	}
}