package com.sam.misc;

public class OnesZeroes{
	public static int getNumber(int a){
		StringBuilder sb = new StringBuilder("10");
		StringBuilder temp = new StringBuilder(sb);
		while(true){
			
			if( Integer.valueOf(temp.toString())%a ==0)
				return Integer.valueOf(temp.toString());
			for(int i= temp.length()-1;i>=-0;i--){
				
				if(i==0){
					sb.append("0");
					temp = sb;
					break;
				}
				
				if( temp.charAt(i) == '0'){
					temp.setCharAt(i,'1');
					break;
				}
				else if( temp.charAt(i) == '1'){
					temp.setCharAt(i,'0');
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println(getNumber(8));
		
	}
}