package com.sam.misc;

public class Regex{
	
	public static void main(String[] args){
		String s = "-123.5";
		
		String regex = "(-)?(\\d)+(.)?(\\d)?";
		
		System.out.println(s.split(regex).length);
	}
}