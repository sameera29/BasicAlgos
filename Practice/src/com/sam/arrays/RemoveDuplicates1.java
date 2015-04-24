package com.sam.arrays;

public class RemoveDuplicates1{
	
	
	public static StringBuffer remove(StringBuffer str){
		int i,j,pos;
		int len = str.length();
		pos = 1;
		for(i = 1;i<len;i++){
			for(j=0;j<pos;j++){
				if(str.charAt(i)==str.charAt(j)){
					break;
				}
			}
			if(j==pos){
				str.setCharAt(pos, str.charAt(i)) ;
				pos++;
			}
		}
		str.delete(pos, len);
		return str;
		
	}
	
	public static void main(String args[]){
		StringBuffer str = new StringBuffer("abcdacd");
		System.out.println(str);
		 str = remove(str);
		System.out.println("After "+str.toString());
	}
}