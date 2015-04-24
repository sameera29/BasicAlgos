package com.sam.ds;
public class Queue{
	static class Node{
		String data;
		Node next;
		public Node(){
			
		}
		
	}
	public static Node  front,rear;
	
	public  static void  initialize(){
		front = rear = null;
	}
	public  static void addNode(String text){
		
		Node newNode = new Node();
		newNode.data = text;
		newNode.next = null;
		if(front == null){
			front = newNode;
			rear = newNode;
			
		}
		else{
			rear.next = newNode;
			rear = newNode;
		}
				
			
		}
	public static void printQueue(){
		Node cur = new Node();
		cur = front;
		while(cur!=null){
			System.out.println(cur.data+"\n");
			cur = cur.next;
		}
	}
	
	public static void deleteNode(){
		if (front == null){
			System.out.println("Queue empty");
		}
		else if (front == rear){
			System.out.println("Last node "+front.data);
			front = front.next;
		}
		else{
			front = front.next;
			printQueue();
		}
	}
	public static void main(String[] args){
		initialize();
		addNode("first");
		addNode("second");
		addNode("third");
		addNode("fourth");
		printQueue();
		System.out.println("Queue front  is: "+front.data);
		deleteNode();
		deleteNode();
		deleteNode();
		deleteNode();
		deleteNode();
		deleteNode();
	}
	}
