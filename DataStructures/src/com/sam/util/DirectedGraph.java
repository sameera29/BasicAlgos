package com.sam.util;

import java.util.ArrayList;



public class DirectedGraph<T>{
	/**
	 * A directed graph with vertices and weighted edges 
	 * */
	public ArrayList<GraphNode> vertices = new ArrayList<GraphNode>();
	
	public DirectedGraph(){
		
	}
	public void addNode(T data){
		GraphNode<T> node = new GraphNode(data);
		this.vertices.add(node);
		
	}
	public void addNode(GraphNode<T> node){
		this.vertices.add(node);
	}
	
	public void addEdge(GraphNode<T> a, GraphNode<T> b, int weight){
		a.neighbors.put(b, weight);
		
	}
	public int getWeight(GraphNode<T> a, GraphNode<T> b){
		// Returns -1 if no edge between the vertices
		
		if(!a.neighbors.containsKey(b))
			return -1;
		return a.neighbors.get(b);
		
	}
	
	public GraphNode getNode(T data){
		for(int i =0;i<vertices.size();i++){
			if(vertices.get(i).data.equals(data))
				return vertices.get(i);
		}
		return null;
		
	}
	
}