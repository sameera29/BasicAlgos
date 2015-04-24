package com.sam.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ValueComparator implements Comparator<String>{

	Map<String,Integer> base;
	
	public ValueComparator(Map<String, Integer> map){
		this.base = map;
	}
	

	//Sort in descending order
	public int compare(String a, String b) {
		
		if(base.get(a) == base.get(b))
			return 0;
		
		
		 
		 return base.get(a) > base.get(b)?-1:1;
		
		
	}

	
}