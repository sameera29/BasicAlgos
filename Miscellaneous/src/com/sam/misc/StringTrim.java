package com.sam.misc;

public class StringTrim{
	public static String str = "---Hello---World---Hello-World-----";
	public static void trim(){
		StringBuilder s = new StringBuilder(str);
		int len=str.length();
		int i=0,c=0;
		while(i<len){
			if(s.charAt(i)=='-'){
				c++;
			}
			else{
				s.setCharAt(i-c,s.charAt(i));
				s.setCharAt(i, '-');
				if(s.charAt(i+1) == '-'){
					i++;
					s.setCharAt(i-c,s.charAt(i));
				}
			}
			i++;
		}
		
		String st = s.substring(0, len-c);
		System.out.println("Final String: "+st);
	}
	public static void main(String args[]){
		trim();
	}
}