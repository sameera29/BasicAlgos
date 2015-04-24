package com.sam.ds;

import java.util.ArrayList;

public class The100Game{
	public static int raceTo;
	public static ArrayList<Integer> pool = new ArrayList<Integer>();
	
	public The100Game(int sum, int maxVal){
		if( ((maxVal*maxVal+maxVal)/2) < sum ){
			throw new IllegalArgumentException();
		}
		raceTo = sum;
		for(int i =1;i<=maxVal;i++){
			pool.add(i);
		}
	}
	public boolean canIWin(){
		int turns =0;
		while(raceTo >=0){
			turns++;
			int num = pickANumber();
			raceTo = raceTo-num;
			System.out.println("Player "+((turns%2==0)?2:1)+" chose:  "+
				num+" Remaining "+raceTo);
		}
		return ((turns%2!=0));
	}
	
	public static int pickANumber(){
		int max = -1;
		int len = pool.size();
		int num;
		
		for(int i=len-1;i>=0;i--){
			num = pool.get(i);
			if( pool.get(i) >= raceTo ){
				
				raceTo = raceTo-num;
				pool.remove(i);
				return num;
			}
			else {
				if(max > 0){
					if( num < max ){
						pool.remove(i);
						raceTo = raceTo-num;
						return num;
					}
					else{
						continue;
					}
			}
				if(i-1 >=0 ){
					if(num + pool.get(i-1) < raceTo){
						pool.remove(i);
						raceTo = raceTo-num;
						return num;
					}
					else{
						max = raceTo- num;
						i--;
						continue;
					}
				}
				else{
					pool.remove(i);
					raceTo = raceTo-num;
					return num;
					
				}
		}
	}
		return -1;
}

}