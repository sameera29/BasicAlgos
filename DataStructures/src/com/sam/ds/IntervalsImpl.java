package com.sam.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sam.util.Intervals;
import com.sam.util.IntervalPoint;

public class IntervalsImpl implements Intervals{
	List<IntervalPoint> list = new ArrayList<IntervalPoint>();

	public void addInterval(int x, int y) {
		// TODO Auto-generated method stub
		list.add(new IntervalPoint(x,y));

		
	}

	public int getTotalCoveredLength() {
		// TODO Auto-generated method stub
		Collections.sort(list);
		
		int totalLen = 0;
		IntervalPoint l = new IntervalPoint(0,0);
		for( IntervalPoint p : list){
			if( (l.y > p.x ) && (l.y < p.y)){
				totalLen = totalLen + p.y - l.y;
				l = p;
			}
			else if( l.y > p.y){
				l=p;
			}
			else {
				totalLen = totalLen + (p.y-p.x);
				l = p;
			}
		}
		return totalLen;
		
		}
	
	public static void main(String[] args){
		IntervalsImpl i =  new IntervalsImpl();
		i.addInterval(1, 5);
		i.addInterval(8, 9);
		i.addInterval(3, 6);
		i.addInterval(2, 7);
		i.addInterval(1, 8);
		
		System.out.println(i.getTotalCoveredLength());
		
	}
	
	
	
	
}