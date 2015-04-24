package com.sam.util;

public class IntervalPoint implements Comparable<IntervalPoint> {
	public int x;
	public int y;
	public IntervalPoint(int x, int y){
		if(x>y)
			throw new IllegalArgumentException(" start can't be greater than end");
		this.x = x;
		this.y =y;
	}
	
	public int compareTo(IntervalPoint p){
		return (p==null)? 0: (this.x - p.x);
		
	}

	

	
}
