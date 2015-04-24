package com.sam.util;

public class SeqNode implements Comparable<SeqNode> {
	public int m;
	public int n;
	public int value;
	
	public SeqNode(){
	
	}
	public SeqNode(int m, int n, int value){
		m = m;
		n = n;
		value = value;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int compareTo(SeqNode n) {
		// TODO Auto-generated method stub
		if(this.value == n.value)
			return 0;
		if(this.value > n.value)
			return -1;
		else
			return 1;
	}

	

}
