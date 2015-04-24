package com.sam.ds;

import java.util.*;
public class PriorityQueue {
	public static TreeSet pq;
	
	public static PriorityQueue pr = new PriorityQueue();
	public static ArrayList<Integer> l = new ArrayList<Integer>();
	public static void createList(){
		 int h[] = {10,15,20,38,50,40,45,60,43,68,70,55,65};
		 for (int i=0;i<h.length;i++){
			 l.add(h[i]);
		 }
		pq = new TreeSet(l);
		
	}
	public static void printPQ(){
		Object obj;
		Iterator it = pq.iterator();
		/*
		while(pq.size()>0){
			 obj = pq.first();
			 System.out.println(obj);
			//pq.remove(pq.first());
		}
		*/
		while( it.hasNext() ){
			System.out.println(it.next());
		}
			
	}
	
	public static void createPQ(){
		pq = new TreeSet();
		pq.add(50);
		pq.add(10);
		pq.add(500);
		pq.add(3);
		pq.add(20);
		
	
		
		
	}
	public static void main(String[] args){
		//createList();
		createPQ();
		printPQ();
		
		pq.remove(50);
		
		System.out.println("After removal");
		printPQ();
		
		
		
	}
	
}