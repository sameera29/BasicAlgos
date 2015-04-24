package com.sam.ds;



public class LinkedList{
	static class Node{
	String data;
	Node next;
	public Node(){
		
	}
	
}
public static Node  head;

public  static void  initialize(){
	head = null;
}
public  static void addNodeAtEnd(String text){
	
	Node newNode = new Node();
	Node cur;
	newNode.data = text;
	newNode.next = null;
	if(head == null){
		head = newNode;
		
	}
	else{
		cur = head;
		while(cur.next!=null){
			cur = cur.next;
		}
		cur.next = newNode;
	}
			
		
	}
public static void printList(){
	Node cur = new Node();
	cur = head;
	while(cur!=null){
		System.out.println(cur.data+"\n");
		cur = cur.next;
	}
}

public static void deleteNode(){
	if (head == null){
		System.out.println("Queue empty");
	}
	else if (head.next ==null){
		System.out.println("Last node "+head.data);
		head = head.next;
	}
	else{
		head = head.next;
		printList();
	}
}

public static Node reverse(Node root){
	
	if(root.next== null){
		head = root;
		return head;
	}
	else{
		root.next = reverse(root.next);
		root.next.next = root;
		return root;
	}
	
}
public static void main(String[] args){
	initialize();
	Node temp ;
	addNodeAtEnd("first");
	addNodeAtEnd("second");
	addNodeAtEnd("third");
	addNodeAtEnd("fourth");
	addNodeAtEnd("fifth");
	printList();
	System.out.println("List head  is: "+head.data);
	if(head!=null){
		temp = reverse(head);
		temp.next=null;
	}
	printList();
}
}