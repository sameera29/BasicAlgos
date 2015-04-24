package com.sam.ds;

public class CaseComb{
	public static String str = "0ab";
	
	public static void printComb(){
		int len = str.length();
		char[] res = str.toCharArray();
		char[] s = str.toCharArray();
		int i,j;
		

			for(i=0;i<len;i++){
				res = str.toCharArray();
				if((res[i] >='0')&&(res[i]<='9')){
					continue;
				}
				for(j=0;j<len;j++){
					System.out.println(res[j]);
				}
				System.out.println("\n");
				if(Character.isLowerCase(s[i])){
					res[i] = Character.toUpperCase(res[i]);
				}
				else{
					res[i] = Character.toLowerCase(res[i]);
				}
				
				for( j=0;j<len;j++){
					System.out.println(res[j]);
				}
				System.out.println("\n");
			}
		
		
		
	}
	public static void main(String[] args){
		char ch = 'a';
		
		printComb();
	}
}