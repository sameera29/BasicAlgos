package com.sam.traversals;

import com.sam.util.*;

public class StackTest{
	public static Stack<String> s = new Stack<String>();
	
	public static void printStack(){
		Node<String> node = s.top;
		while(node.getNext() != null){
			System.out.println(node.getDataNode());
			node = node.getNext();
		}
		///System.out.println(node.getDataNode());
	}
	
	public static void main(String[] args){

		s.push("first");
		s.push("second");
		s.push("third");
		s.push("fourth");
		printStack();
		System.out.println("Pooping 1");
		s.pop();
		printStack();
		System.out.println("Pooping 2");
		s.pop();
		printStack();
		System.out.println("Pooping 3");
		s.pop();
		printStack();

	
		
		
	}
}