package com.sam.misc;

public class ReverseInPlace{
	public static void main(String[] args){
		String str = "Do or do not, there is no try.";
		String[] tokens = str.split(" ");
		String out ="";
		for(int i= tokens.length-1;i>=0;i--){
			out = out+tokens[i];
			if(i!=0)
				out = out+" ";
		}
		System.out.println(out);
	}
}