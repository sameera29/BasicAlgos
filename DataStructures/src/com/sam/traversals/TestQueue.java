package com.sam.traversals;

import com.sam.util.*;

public class TestQueue{
	public static void main(String[] args){
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(11);
		
		q.printQueue();
		
		System.out.println("DEQUEU");
		while(!q.isEmpty()){
			Node<Integer> node = q.dequeue();
			System.out.println(node.getDataNode());
		}
		
	}
}