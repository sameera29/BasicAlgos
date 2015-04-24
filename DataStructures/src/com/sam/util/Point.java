package com.sam.util;

public class Point implements Comparable{
	double x;
	double y;
	Double distanceFromCenter = null;
	
	public Double getDistanceFromCenter() {
		return distanceFromCenter;
	}
	public void setDistanceFromCenter(Double distanceFromCenter) {
		this.distanceFromCenter = distanceFromCenter;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point(){
		
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getDistanceFromCenter(double a, double b){
		double dist = Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
		return dist;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}

