package com.sam.misc;

public class IntStringConvert{
	public static String str= "23476";
	public static int convertToInt(String str){
		int num=0,i=0;
		boolean flag=false;
		if(str.charAt(i) == '-'){
			flag= true;
			i++;
		}
		while(i<str.length()){
			int in = (int) (str.charAt(i) -'0');
			num = num*10 + in;
			i++;
		}
		if(flag)
			num= num * (-1);
		
		return num;
	}
	public static String convertToString(int num){
		int i=0,j=0;
		StringBuilder  str = new StringBuilder("");
		StringBuilder  str2 = new StringBuilder("");
		boolean flag = false;
		if(num<0){
			str2.append('-');
			num=num*(-1);
		}
		while(num>0){
			str.append(num%10);
			num = num/10;
		}
		
		for(i=str.length()-1;i>=0;i--){
			str2.append(str.charAt(i));
		}
		
		return str2.toString();
	}
	public static void main(String[] args){
		int num = convertToInt(str);
		System.out.println("Integer= "+num );
		String str = convertToString(65437);
		System.out.println("String = "+str);
	}
}