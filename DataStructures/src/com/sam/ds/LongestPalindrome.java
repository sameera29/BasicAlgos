package com.sam.ds;

public class LongestPalindrome{
	public static String str ="fabcddcba";
	
	
	public static String expand(String s, int l, int h){
		int len = s.length();
		//System.out.println("Initial L :"+l+" H: "+h);
		while( (l>=0) && (h<=len-1) && (s.charAt(l) == s.charAt(h))){
			l--;
			h++;
		}
		//System.out.println("L "+l+"  H: "+h);
		return s.substring(l+1, h);
	}
	
	public static String getLongest(String s){
		int len = s.length();
		int i=0,j=0;
		String p1,p2;
		String pal = s.substring(0,1);
		if(len == 0)
			return "";
		for(i=0;i<len;i++){
			p1 = expand(s,i,i);
			if(p1.length() > pal.length()){
				pal = p1;
				//System.out.println("Change Pal 1 "+pal);
			}
		}
		for(i=0;i<len;i++){
			p2 = expand(s,i,i+1);
			if(p2.length() > pal.length()){
				pal = p2;
				//System.out.println("Change Pal 2 "+pal);
			}
		}
		return pal;
	}
	
	
		
	public static void main(String[] args){
		System.out.println(getLongest(str));
		//System.out.println(str.substring(0,1));
	}
}