package com.sam.util;

public class Queue<T>{
	public Node<T> head;
	public Node<T> rear;
	
	public Queue(){
		head = null;
		rear = null;
	}
	
	
	
	public void enqueue(T data){
		Node<T> queueNode = new Node<T>(data);
		if(head ==null){
			head = queueNode;
			rear = queueNode;
		}
		else{
			rear.setNext(queueNode);
			rear = queueNode;
		}
	}
	
	public Node<T> dequeue(){
		if(head == null){
			return null;
		}
		else{
			Node<T> node  = head;
			head = head.getNext();
			return node;
		}
	}
	public boolean isEmpty(){
		if(head == null ) 
			return true;
		else
			return false;
	}
	
	public void printQueue(){
		Node<T> cur  = head;
		while(cur != null){
			System.out.println(cur.getDataNode());
			cur = cur.getNext();
		}
	}
	
}