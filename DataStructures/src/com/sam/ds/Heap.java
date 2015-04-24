package com.sam.ds;

public class Heap{
	public static int h[] = {10,15,20,38,50,40,45,60,43,68,70,55,65};
	public  static int cap = 15;
	public static int last = 12;
	public int lev = 4;
	
	public static int minimumAt(int x, int y){
		if(h[x]<h[y])
			return x;
			else
				return y;
	}
	
	public static void swap(int x, int y){
		int t;
		t=h[x];
		h[x]=h[y];
		h[y]= t;
	}
	
	public static void printHeap(){
		for (int i =0; i<=last; i++){
			System.out.println(h[i]+"  ");
		}
	}
	
	public static void downBubble(){
		int i = 0;;
		int minInd =0;
		
		while((2*i+2) <= last){
			if((h[i] > h[2*i+1]) || (h[i]>h[2*i+2])){
				minInd = minimumAt(2*i+1,2*i+2);
				System.out.println("MinInd "+minInd);
				swap(i,minInd);
				i = minInd;
				
			}
		}
	}
	
	public static void pop(){
		System.out.println("The minimum is "+h[0]);
		//Swapping with the last
		h[0] = h[last];
		last --;
		downBubble();
		
		
	}
	
	public static int getParent(int n){
		if(last%2 == 0)
			return (last-2)/2;
		else
			return (last-1)/2;
	
	}
	
	public static void upBubble(int last){
		int i;
		i = getParent(last);
		
		while(i>=0){
			if( (h[i] > h[(2*i+1)]) || (h[i]> h[(2*i+2)])){
				int minInd = minimumAt(2*i+1,2*i+2);
				swap(i,minInd);
				i = getParent(i);
			}
		}
	}
	public static void add(int num){
		h[last+1] = num;
		last++;
		upBubble(last);
	}
	
	public static void main(String args[]){
		System.out.println("Original heap\n");
		printHeap();
		pop();
		System.out.println("After popping minimum: \n");
		printHeap();
		add(20);
		System.out.println("After adding");
		printHeap();
		
		
	}
	
}