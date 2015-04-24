package com.sam.ds;

import java.util.ArrayList;
import java.util.List;

public class Combination{
	public static List<String> comb(String org){

		int len = org.length();
		int i;
	
		List<String> combi = new ArrayList<String>();
		List<String> temp = new ArrayList<String>();
	
		if(len == 1){
			combi.add(org);
			return combi;
		}
		
	
			 i =0;
		
			combi.add(""+org.charAt(i));
			System.out.println(org.charAt(i));
			String buf = new String(org.toCharArray(),i+1,len-i-1);
			temp = comb(buf);
			for (String str : temp){
				combi.add(org.charAt(i)+str);
				System.out.println(org.charAt(i)+str);
			}
			combi.addAll(temp);
		
		return combi;
	}
	
	public static List<String> comb(String org, int l, int h){

		int len = h-l;
		int i;
	
		List<String> combi = new ArrayList<String>();
		List<String> temp = new ArrayList<String>();

		if(l==h){
			combi.add(""+org.charAt(l));
			return combi;
		}
			i=l;
			
			combi.add(""+org.charAt(i));
			temp = comb(org,i+1,h);
			for(String c : temp){
				combi.add(c);
				combi.add(org.charAt(i)+c);
			}
		
		return combi;
				}

	
	public static void main(String[] args){
		String org = "abcd";
		int len = org.length();
		List<String> result = comb(org,0,len-1);
		for(String str : result){
			System.out.println(str);
		}
	}
}