package com.sam.ds;

public class LongetsPrefix{
	public static String[] s = {"aaaaaa",
									"aaab", "aaac","aab" };
	
	public static String find(String s1, String s2){
		int l1 = s1.length();
		int l2 = s2.length();
		int l = (l1<l2)?l1:l2;
		int i=0;
		for( i=0;i<l;i++){
			if(s1.charAt(i) != (s2.charAt(i))){
				break;
			}
		}
		return s1.substring(0,i);
		
	}
	
	public static void main(String[] args){
		String pre = s[0];
		for(int j=1;j<s.length;j++){
			pre = find(s[j],pre);
		}
		System.out.println(pre);
	}
}
