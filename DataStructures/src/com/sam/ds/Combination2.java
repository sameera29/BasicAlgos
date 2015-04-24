package com.sam.ds;

public class Combination2{
	public static String str = "wxyz";
	
	
	public static void combine(char[] s,StringBuilder out,int len, int start){
		int outLen;
		for(int i=start;i<len;i++){
			out.append(s[i]);
			System.out.println(out);
			if(i<len-1){
				combine(s,out,len,i+1);
			}
			 out.setLength(out.length()-1);
			 
		}
	}
	public static void main(String[] args){
			char[] s = str.toCharArray();
			int len = s.length;
			StringBuilder out = new StringBuilder();
			combine(s,out,len,0);
	}
}