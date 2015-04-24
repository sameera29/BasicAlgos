package com.sam.misc;

public class StringProcess{
	public static StringBuilder str = new StringBuilder("My name is Sameera Bandhakavi");
	public static StringBuilder str2 = new StringBuilder(str.length()+1);
	
	public static void main(String[] args){
		int i = 5;
		int j = 0;
		str2.setLength(str.length()+1);
		for(j=0;j<i;j++){
			str2.setCharAt(j, str.charAt(j));
		}
		for( j = str.length()-1; j>=i; j--){
			str2.setCharAt(j+1,str.charAt(j));
		}
		str2.setCharAt(i, '\n');
		
		System.out.println(str2);
	}
}