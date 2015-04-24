package com.sam.misc;

public class StringCombNoRec{
	public static String str = "a?b?c?";
	
	public static void genComb(){
		StringBuilder s = new StringBuilder(str);
		StringBuilder result = new StringBuilder(str);
		int len = str.length();
		int i = 0;
		for(i=0;i<s.length();i++){
			if(result.charAt(i)=='?'){
				result.setCharAt(i,'0');
			}
		}
		
		while(true){
			System.out.println(result.toString());
			for(i=len-1;i>=-1;i--){
				if(i== -1){
					return;
				}
				if(s.charAt(i) == '?'){
					if(result.charAt(i) == '0'){
						result.setCharAt(i,'1');
						break;
					}
					else if(result.charAt(i)=='1'){
						result.setCharAt(i,'0');
						continue;
					}
				}
				
			}
		}
	}
		
		public static void main(String args[]){
			genComb();
		}
	
}