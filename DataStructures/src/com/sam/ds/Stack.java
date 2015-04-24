package com.sam.ds;

public class Stack{
	static class Node{
		String data;
		Node next;
	}
	static Node top;
	static void initialize(){
		top = null;
	}
	static void push(String text){
		Node newNode = new Node();
		newNode.data = text;
		newNode.next = null;
		if(top == null){
			//First node in the stack
			top = newNode;
		}
		else{
			newNode.next = top;
			top = newNode;
		}
	}
	
	static void printStack(){
		if(top == null){
			System.out.println("Empty stack!");
		}
		else{
			Node cur =  top;
			while(cur!=null){
				System.out.println(cur.data);
				cur = cur.next;
			}
			
		}
	}
	public static void  pop(){
		if(top == null){
			System.out.println("Empty Stack!");
		}
		else{
			top = top.next;
		}
		printStack();
	}
	public static void main(String args[]){
		initialize();
		push("first");
		push("second");
		push("third");
		push("fourth");
		printStack();
		pop();
		pop();
		pop();
		pop();
		
	}
}