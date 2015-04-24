package com.sam.misc;

import java.util.ArrayList;

public class ReachScore{
	public static ArrayList<ArrayList<Integer>> play(int[] a, int score, ArrayList<Integer> move, ArrayList<ArrayList<Integer>> result){
		if(score == 0){
			result.add(move);
		}
		else{
		for(int i=0;i<a.length;i++){
			if( a[i] <= score){
				move.add(a[i]);
				score = score-a[i];
				ArrayList<ArrayList<Integer>> res = play(a,score,move,result);
				if(res.size() <= result.size()){
					move.remove(move.size()-1);
					score = score+a[i];
					continue;
				}
			}
			else{
				break;
			}
			
		}
		}
		return result;
	}
	
	public static void main(String[] args){
		int a[] = {3,5,10};
		int score = 20;
		ArrayList<Integer> move = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> res = play(a,score,move,result);
		System.out.println(res.size());
	}
}