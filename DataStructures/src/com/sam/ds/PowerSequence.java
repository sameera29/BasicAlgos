package com.sam.ds;

import java.util.TreeSet;

import com.sam.util.SeqNode;

public class PowerSequence{
	public static TreeSet<SeqNode> set = new TreeSet<SeqNode>();
	
	public static void main(String[] args){
		TreeSet<SeqNode> set = new TreeSet<SeqNode>();
		SeqNode s = new SeqNode(2,2,4);
		set.add(s);
		set.add(new SeqNode(3,3,27));
		set.add(new SeqNode(5,2,25));
		set.add(new SeqNode(2,4,16));
		
		for (SeqNode n : set){
			System.out.println(n.value);
		}
	}
}