package com.sam.ds;

public class Permutation2{
	public static String str = "abcd";
	
	public static void permute(char[] s,boolean[] used,StringBuffer out, int len, int level){
		if(level==len){
			System.out.println(out.toString());
			return;
		}
		for(int i =0;i<len;i++){
			if(used[i])
				continue;
			out.append(s[i]);
			used[i]=true;
			permute(s,used,out,len,level+1);
			used[i] = false;
			out.setLength(out.length()-1);
		}
		
	}
	
	public static void main(String[] args){
		char[] s = str.toCharArray();
		StringBuffer out = new StringBuffer();
		int len = s.length;
		boolean used[] = new boolean[len];
		for(int i=0;i<len;i++)
			used[i]=false;
		permute(s,used,out,len,0);
	}
}