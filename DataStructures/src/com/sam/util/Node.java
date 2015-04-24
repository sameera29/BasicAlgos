package com.sam.util;

public class Node<E>{
	E dataNode;
	Node<E> next;
	
	public Node(){
		
	}
	public Node(E dataNode){
		this.dataNode = dataNode;
		this.next = null;
	}
	
	public E getDataNode() {
		return dataNode;
	}
	public void setDataNode(E dataNode) {
		this.dataNode = dataNode;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
}