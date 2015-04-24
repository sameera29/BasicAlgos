package com.sam.misc;

import java.util.Stack;

public class Postfix{
	
	
	public static boolean isOperator(String c){
		if( (c =="+") || (c == "-") || (c =="*") || (c== "/") )
			return true;
		else
			return false;
	}
	public static double compute(String[] str){
		Stack<Double> s = new Stack<Double>();
		double num,a,b;
		for(int i=0;i<str.length;i++){
			if( !isOperator(str[i]) ){
				
				s.push(Double.valueOf(str[i]));
			}
			else{
				if(s.size() < 2){
					throw new IllegalArgumentException();
				}
				else{
					 b = s.pop();
					 a = s.pop();
				}
				char c = str[i].charAt(0);
				switch(c){
				case '+' : 
					
					num = a +b;
					s.push(num);
					break;
					
				case '-' : 
					num = a - b;
					s.push(num);
					break;
				
				case '*' : 
					num = a * b;
					s.push(num);
					break;
				
				case '/' : 
					num = a / b;
					s.push(num);
					break;
				}
			}
		}
		return s.pop();
	}
	
	
	public static void main(String[] args){
		//String[] str = {"4","1","+","2.5","*"};
		
		String[] str = {"5","80","40","/","+"};
		
		System.out.println(compute(str));
	}
}