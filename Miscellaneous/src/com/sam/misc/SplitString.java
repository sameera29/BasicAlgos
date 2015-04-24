package com.sam.misc;

public class SplitString{
	public static StringBuffer str = new StringBuffer("abcde");
	
	public static void split(StringBuffer s){
		int len =s.length();
		for(int i=1;i<s.length();i++){
			System.out.println(s.substring(0,i)+"  AND  "+s.substring(i,len));
		}
	
		
	}
	
	public static void main(String[] args){
		split(str);
	}
}