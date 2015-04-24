package com.sam.misc;

public class CommonCharInArrayOfStrings{
	
	public static void main(String[] args){
		String[] a = {"aghkafgkit","dfghako","qwemnakrf"};
		
		findCommon(a);
		
	}
	
	public static void findCommon(String[] a){
		int totalCt[] = new int[26];
		boolean indCt[] = new boolean[26];
		int commonCt = 0;
		
		for(int i=0;i<26;i++){
			totalCt[i] = 0;
		}
		for(int i=0;i<26;i++){
			indCt[i] = false;
		}
		
		for(String s : a){
			for (char c : s.toCharArray()){
				if(indCt[c-'a']== true)
					continue;
				else{
					totalCt[c-'a']++;
					indCt[c-'a'] = true;
				}
			}
			for(int i=0;i<26;i++){
				indCt[i] = false;
			}
		}
		for(int i=0;i<26;i++){
			if(totalCt[i] == a.length)
				commonCt++;
		}
		System.out.println("Common Character count is :"+commonCt);
	}
}