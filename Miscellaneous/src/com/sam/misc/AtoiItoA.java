package com.sam.misc;

public class AtoiItoA{
	
	public static void main(String[] args){
		String s = "125.5";
		int num = toAtoi(s);
		System.out.println("Atoi is: "+num);
		String str  = toItoa(num);
		System.out.println("Itoa is: "+s);
		if(s.equals(str)){
			System.out.println("Its a number");
		}
		else
			System.out.println("Its not a number");
	
	}
	
	public static int toAtoi(String s){
		int num = 0;
		for(int i=0;i<s.length();i++){
			num = num*10+s.charAt(i)-'0';
		}
		return num;
	}
	
	public static String toItoa(int num){
		StringBuffer sb = new StringBuffer();
		while(num >0){
			sb.append(num%10);
			num = num/10;
			
		}
		return sb.reverse().toString();
	}
	
}