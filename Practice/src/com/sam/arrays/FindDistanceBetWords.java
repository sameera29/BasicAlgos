package com.sam.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDistanceBetWords{
	
	static class WordDistanceFinder{
		public List<String> wordList ;
		
		WordDistanceFinder(List<String> ls){
			wordList = ls;
			
		}
		public int distance(String a, String b){
			int p1,p2;
			
			int minDist = Integer.MAX_VALUE/2;
			p1 = p2 = -minDist;
			int pos=0;
			for (String s : wordList){
				if(s.equals(a)){
					p1 = pos;
					int d = Math.abs(p2-p1);
					if(d < minDist)
						minDist = d;
				}
				else if(s.equals(b)){
					p2 = pos;
					int d = Math.abs(p2-p1);
					if(d < minDist)
						minDist = d;
				}
				pos++;

			}
			return minDist;
		}
		
		
	}
	public static void main(String[] args){
		
		WordDistanceFinder finder = new WordDistanceFinder(Arrays.asList("the",
				"quick","brown","fox","quick"));
		System.out.println("Min Distance between \"fox\" and \"the\""+finder.distance("fox", "the"));
		;
		
		System.out.println("Min Distance between \"quick\" and \"fox\""+finder.distance("fox", "quick"));
		;
	}
	
}