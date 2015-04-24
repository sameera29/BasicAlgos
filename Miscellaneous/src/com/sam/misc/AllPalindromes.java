package com.sam.misc;

public class AllPalindromes{
	
	public static void printPalindromes(String s){
		for(int i=0;i<s.length();i++){
			for(int j= i;j<s.length();j++){
				String sb = s.substring(i, j+1);
				if(sb.length() <= 1){
					System.out.println(sb);
					continue;
				}
				else{
					if(isPalindrome(sb)){
						System.out.println(sb);
						
					}
				}
			}
		}
		
	}
	
	public static boolean isPalindrome(String s){
		StringBuffer sb = new StringBuffer(s);
		//System.out.println("Reverse: "+sb.reverse());
		if(sb.reverse().toString().equals(s))
			return true;
		else
			return false;
	}
	
	public static void main(String[] a){
		printPalindromes("mississippi");
	}
}