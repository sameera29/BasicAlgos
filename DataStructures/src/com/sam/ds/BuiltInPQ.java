package com.sam.ds;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BuiltInPQ {
	
	public static PriorityQueue<String> pq = new PriorityQueue<String>();
	public static void main(String args[]){
		pq.offer("sam");
		pq.offer("amit");
		pq.offer("zain");
		pq.offer("meredith");
		while(!pq.isEmpty()){
			System.out.println(pq.remove());
		}
		
	}
	
	
	
	
}