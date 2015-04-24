package com.sam.util;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphNode<T>{
	 public T data;
	 public HashMap<GraphNode<T>, Integer> neighbors = new HashMap<GraphNode<T>,Integer>();

	public GraphNode(){
		
	}
	public GraphNode(T data){
		this.data = data;
	}

	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public HashMap<GraphNode<T>, Integer> getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(HashMap<GraphNode<T>, Integer> neighbors) {
		this.neighbors = neighbors;
	}
	public void addNeighbor(GraphNode<T> node, int weight){
		this.neighbors.put(node,weight);
	}
	
	
}