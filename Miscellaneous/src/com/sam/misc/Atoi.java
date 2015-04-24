package com.sam.misc;

public class Atoi{
	public static String s = "-134";
	
	public static void main(String [] args){
		boolean isNeg = false;
		int l =0;
		if(s.charAt(0)=='-'){
			isNeg= true;
			l=1;
		}
		int num = 0;
		for(int i=l;i<s.length();i++){
			num = num*10+(int)s.charAt(i)-'0';
		}
		if(isNeg)
			num=-1*num;
		System.out.println(num+" "+isNeg);
	}
}