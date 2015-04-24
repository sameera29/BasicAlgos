package com.sam.misc;

import java.io.InputStreamReader;
import java.util.Scanner;

public class StringMisc{
	public static String str = "abcgdt dafrga";
	public static void removeChar(String str){
		char[] s = str.toCharArray();
		int i=0;
		for(i=0;i<s.length;i++){
			if(s[i]=='a'){
				s[i]='=';
			}
		}
		String str1 ="";
		for(i=0;i<s.length;i++){
			if(s[i]!='='){
				str1=str1+s[i];
			}
		}
		System.out.println(str1);
		
	}
	
	public static void main(String[] args){
		removeChar(str);
	}
	
}