package com.sam.ds;


public class Misc{
	
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
	
	
	
	public  static void main(String args[]){
		String str ="abcd";
		char[] s = str.toCharArray();

		for(int i=0;i<s.length;i++){
			String res = remove(s,i);
			String st = new String(s);
			//System.out.println("Original "+st+"   Res: "+res);
		}
		int i=5;
		int n=5;
		String d = "\"%"+n+"s\"";
		
		for (i=0;i<5;i++){
			String rep = String.format(d, Integer.toBinaryString(i));
		System.out.println(rep.replace(' ', '0'));
		}
	}
	
	public static void reverse(){
		int src=0,cur=0;
		int des =0;
		String s = "Do or die";
		System.out.println("Original "+s);
		char[] str = s.toCharArray();
		int len = str.length;
		while((src<len)&&(des<len)){
			while(str[des] != ' '){
				des++;
			}
			cur = des;
			
			
		}
	}
}