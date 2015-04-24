package com.sam.ds;

import java.math.BigInteger;

public class SpecificSequenceGen{
	
	public static void main(String[] args){
		int[] count = { 5,1,1,1};
		
		int len = count[0]+count[1]+count[2]+count[3];
		int res = generate("",len,count);
		System.out.println(res);
		
	}
	
	public static int generate(String out, int len, int[] count){
		BigInteger max = new BigInteger("1000000007");
	
		if(out.length() == len){
			BigInteger num = new BigInteger(out);
			int r = Integer.parseInt(num.mod(max).toString());
			System.out.println(out);
			return r;
		}
		for( int i=1; i<=4;i++){
			if( (out.isEmpty() || (out.charAt(out.length()-1)-'0' != i) ) && (count[i-1]>0) ){
				count[i-1]--;
				 int res = generate(out+i,len,count);
				 if(res != -1)
					 return res;
				 count[i-1]++;
			}
			
		}
		return -1;
	}
}