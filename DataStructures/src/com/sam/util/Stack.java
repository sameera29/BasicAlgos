package com.sam.util;

import com.sam.util.*;

public class Stack<T> {
	public  Node<T> top;
	
	public Stack(){
		top = new Node<T>();
	}
	public  void push(T node){
		Node<T> stackNode = new Node<T>(node);
		if  (top == null)	{
			top = stackNode;
		}
		else{
			stackNode.setNext(top);
			top = stackNode;
		}
	}
	
	public  Node<T> pop(){
		if(top == null){
			return null;
		}
		else{
			Node<T> node = new Node<T>(top.getDataNode());
			top = top.getNext();
			return node;
		}
	}
	public  Node<T> peek(){
		if(top == null){
			return null;
		}
		else{
			Node<T> node = new Node<T>(top.getDataNode());
			return node;     //Returns a copy of the Stack top
		}
	}
	
	public boolean isEmpty(){
		if(top.getDataNode() == null)
			return true;
		else
			return false;
	}
}