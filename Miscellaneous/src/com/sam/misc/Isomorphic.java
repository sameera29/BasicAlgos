package com.sam.misc;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic{
	
	public static void main(String[] args){
		System.out.println(areIsomorphic("axy","boo")+"  "+areIsomorphic2("axy","boo"));
		System.out.println(areIsomorphic("bar","foo")+"  "+areIsomorphic2("bar","foo"));
		System.out.println(areIsomorphic("turtle","tletur")+"  "+areIsomorphic2("turtle","tletur"));
		System.out.println(areIsomorphic("ab","ca")+"  "+areIsomorphic2("ab","ca"));
	}
	
	public static boolean areIsomorphic2(String p, String q){
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		if(p.length() != q.length())
			return false;
		for (int i=0;i<p.length();i++){
			char c = p.charAt(i);
			char d = q.charAt(i);
			if(!map1.containsKey(c))
				map1.put(c,i);
			if(!map2.containsKey(d))
				map2.put(d,i);
		}
		for( int i =0;i<p.length();i++){
			if(map1.get(p.charAt(i)) != map2.get(q.charAt(i)))
				return false;
				
		}
		return true;
	}
	public static boolean areIsomorphic(String p,String q){
		Map<Character,Character> map=new HashMap<Character,Character>();
	
		if(p.length() != q.length())
			return false;
		for(int i = 0;i<p.length();i++){
			char c = p.charAt(i);
			if( map.containsKey(c)){
				if( map.get(c) != q.charAt(i)){
					return false;
				}
			}
			else{
				if(map.containsValue(q.charAt(i)))
					return false;
				if(c != q.charAt(i)){
					map.put(c, q.charAt(i));
				}
				else{
					return true;
				}
			}
		}
		return true;
	}
}