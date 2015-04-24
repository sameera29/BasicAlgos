package com.sam.arrays;

import java.util.HashMap;
import java.util.Map;

public class DataStructure{
	public static HashMap<String,HashMap<String,Integer>> map = 
			new HashMap<String,HashMap<String,Integer>>();
			
	public static void main(String[] args){
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		m.put("Page1", 2);
		map.put("user1", m);
		
		System.out.println("Printing key value");
		for(Map.Entry e : map.entrySet())
			System.out.println(e.getKey()+"  "+ e.getValue());
	
		
	}
	
	
}