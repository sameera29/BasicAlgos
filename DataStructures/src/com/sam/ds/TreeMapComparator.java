package com.sam.ds;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.sam.util.*;

public class TreeMapComparator{
	
	
	public static void main(String[] args){
		 Map<String,Integer> map = new HashMap<String,Integer>();
		 ValueComparator vc = new ValueComparator(map);
		 SortedMap<String,Integer> sortedMap = new TreeMap<String,Integer>(vc);
		map.put("A",3);
		map.put("B",5);
		map.put("C",5);
		map.put("D",7);
		map.put("E",2);
		
		System.out.println(map);
		sortedMap.putAll(map);
		System.out.println("Sorted Map");
		System.out.println(sortedMap);
		
		System.out.println("Current Mode is: "+sortedMap.firstKey());
		
		int ct = sortedMap.get("D");
		/*sortedMap.put("D", ct-3);
		
		
		System.out.println("New Mode: "+sortedMap);
		
		*/
		
	}
	
	
}