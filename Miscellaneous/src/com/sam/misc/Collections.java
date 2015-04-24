package com.sam.misc;

import java.util.HashMap;

public class Collections{
	public static HashMap<String, String> map = new HashMap<String, String>();
	
	public static void findDestination(String org){
		String next;
		next = map.get(org);
		while(!next.equals(null)){
			if(map.containsKey(next)){
				next = map.get(next);
			}
			else{
				break;
			}
		}
		System.out.println("Final Destination "+next);
		
	}
	
	public static void findOrgDest(String from, String to){
		String org = from;
		while(true){
			if(map.containsValue(org)){

				
			}
		}
	}
	
	public static void main(String[] args){
		map.put("JFK","LHR");
		map.put("LAX","JFK");
		map.put("SFO","LAX");
		map.put("LHR","CDG");
		map.put("DXB","HKG");
		map.put("CDG","DXB");
		map.put("HKG","HAM");
		
		//findDestination("SFO");
		//Find origin and destination, given the tickets
		//findOrgDest();
	
		
		
	
		
	}
	
	
	
}