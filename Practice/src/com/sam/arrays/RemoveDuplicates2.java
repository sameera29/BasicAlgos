package com.sam.arrays;

public class RemoveDuplicates2{
	public static int let[] = new int[256];
	
	RemoveDuplicates2(){
		for(int i = 0;i<256;i++){
			let[i] = 0;
		}
	}
	
	public static StringBuffer remove(StringBuffer str){
		int i = 0;
		int pos = 0;
		int len = str.length();
		
		
		for (i = 0;i<len;i++){
			if(let[str.charAt(i)] == 0){
				let[str.charAt(i)]++;
				str.setCharAt(pos, str.charAt(i));
				pos++;
			}
		}
		str.delete(pos, len);
		return str;
	}
	
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("abcdacd");
		System.out.println(str.toString());
		StringBuffer s = remove(str);
		System.out.println("After "+s);
		
	}
}