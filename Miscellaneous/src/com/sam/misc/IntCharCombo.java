package com.sam.misc;

public class IntCharCombo{
	public static String str = "a0b2c";
	
	public static StringBuilder result = new StringBuilder(str.toLowerCase());
	
	public static void printComb(){
		//System.out.println(result);
		int i,j,len = str.length();
		char ch;
		while(true){	
			System.out.println(result);
			for(j=len-1;j>= -1;j--){
				if(j== -1){
					return;
				}
				ch = result.charAt(j);
				if(Character.isLetter(ch)){
					if(Character.isUpperCase(ch)){
						result.setCharAt(j,Character.toLowerCase(ch));
						continue;
					}
					else{
						result.setCharAt(j,Character.toUpperCase(ch));
						break;
					}

				}
			}
		}

	}
	
	public static void main(String[] args){
		printComb();
	}

}