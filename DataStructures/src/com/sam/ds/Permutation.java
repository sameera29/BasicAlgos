package com.sam.ds;

import java.util.ArrayList;
import java.util.List;


public class Permutation{
	public static String remove(char[] s, int ind){

		int i=0;

		String str = "";
		for(i=0;i<s.length;i++){
			if(i==ind)
				continue;
			else{
				str = str+s[i];
			}
		}
		return str;
	}
	//Using remove
	public static List<String> permute(String org){
		List<String> perm = new ArrayList<String>();
		List<String> temp = new ArrayList<String>();
		int i=0;
		int len = org.length();
		char[] orgc = org.toCharArray();
		if(len == 1){
			perm.add(org);
			return perm;
		}
		for(i=0;i<len;i++){
			temp = permute(remove(orgc,i));
			for (String str : temp){
				perm.add(orgc[i]+str);
			}
		}
		return perm;
	}
	
	
	public static void main(String args[]){
		String org = "abcd";
		boolean used[] = new boolean[org.length()];
		for(int i =0;i<org.length();i++)
			used[i]=false;
		List<String> result = new ArrayList<String>();
		char[] orgc = org.toCharArray();
		result = permute(org);
		for (String str : result){
			System.out.println(str);
		}
		
	}

}