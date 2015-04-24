package com.sam.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Telephone{
	public static Map<Integer,char[]> map = new HashMap<Integer,char[]>();
	
	public static char getChar(int num, int p){
		char c[] = new char[3];
		char ch;
		int i = p-1;
		c = map.get(num);
		ch = c[i];
		return ch;
		
	}
	
	public static void telephoneInit(){

		map.put(2,new char[]{'a','b','c'});
		
		map.put(3,new char[]{'d','e','f'});
		map.put(4,new char[]{'g','h','i'});
		map.put(5,new char[]{'j','k','l'});

		map.put(6,new char[]{'m','n','o'});
		map.put(7,new char[]{'p','r','s'});
		map.put(8,new char[]{'t','u','v'});
		map.put(9,new char[]{'w','x','y'});
		
	}
	
	public static ArrayList<String> telephoneGen(int[] num, int l, int h){
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> tel = new ArrayList<String>();
		int i;
		
		if(l==h){
			if((num[l]!=0)&&(num[l]!=1)){
				tel.add(""+getChar(num[l],1));
				tel.add(""+getChar(num[l],2));
				tel.add(""+getChar(num[l],3));
			}
			else{
				tel.add(""+num[l]);
			}
			return tel;
		}
		i=l;
		temp = telephoneGen(num,i+1,h);
		for(String t : temp){
			if((num[i]!=0)&&(num[i]!=1)){
				tel.add(""+getChar(num[i],1)+t);
				tel.add(""+getChar(num[i],2)+t);
				tel.add(""+getChar(num[i],3)+t);
			}
			else{
				tel.add(""+num[i]+t);
			}
		}
		return tel;
	}
	
	public static void main(String args[]){
		telephoneInit();
		int num[] = {4,9,7,1,9,2,7};
		ArrayList <String> result = telephoneGen(num,0,num.length-1);
		System.out.println(result.size());
		for(String s : result){
			//System.out.println(s);
		}
		
	}
}