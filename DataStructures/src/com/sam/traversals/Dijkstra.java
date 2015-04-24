package com.sam.traversals;

import java.util.ArrayList;

import com.sam.util.DirectedGraph;
import com.sam.util.GraphNode;

public class Dijkstra{
	public static DirectedGraph<String> graph = new DirectedGraph<String>();
	
	public static void createGraph(ArrayList<String> nodes, ArrayList<String> edges ){
		//Edges are strings with comma separated values
		
		//adding vertoices
		for(int i=0; i< nodes.size();i++){
			graph.addNode(nodes.get(i));
		}
		/*
		for(int i=0; i< edges.size();i++){
			
			String[] tokens = edges.get(i).split(",");
			GraphNode<String> node1 = new GraphNode<String>();
			
			graph.getNode(tokens[0]).addNeighbor(graph.getNode(tokens[1]),  Integer.valueOf(tokens[2]));
			System.out.println(graph.vertices.get(i).neighbors.entrySet());
		}
		*/
		GraphNode<String> node1= graph.getNode("A");
		GraphNode<String> node2= graph.getNode("B");
		graph.addEdge(node1, node2, 1);
		System.out.println(graph.vertices.get(0).neighbors.get("B"));
	}
	
	public static void printGraph(){
		ArrayList<GraphNode<String>> nodes = new ArrayList<GraphNode<String>>();
		for(int i=0;i<nodes.size();i++){
			System.out.println(nodes.get(i));
			System.out.println("Neighbors "+ nodes.get(i).getNeighbors());
		}
	}
	
	public static void main(String[] args){
		//Create a graph
		
		ArrayList<String> nodes = new ArrayList<String>();
		nodes.add("A");
		nodes.add("B");
		nodes.add("C");
		nodes.add("D");
		nodes.add("E");
		nodes.add("F");
		
		ArrayList<String> edges = new ArrayList<String>();
		edges.add("A,B,1");
		edges.add("A,C,2");
		edges.add("B,D,3");
		edges.add("B,E,4");
		edges.add("B,F,4");
	
		createGraph(nodes,edges);
		printGraph();
		
		
		
		
	}
}