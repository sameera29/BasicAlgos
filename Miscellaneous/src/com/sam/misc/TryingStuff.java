package com.sam.misc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TryingStuff{
	public static void main(String[] args){
		String s = "123";
		for( char c : s.toCharArray()){
			if( (c - '0' >= 0) && (c <= '9'))
				System.out.println("True");
			else
				System.out.println("False");
		}
		
	}
	
	
}