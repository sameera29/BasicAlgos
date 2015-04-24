package com.sam.misc;

public class SpecificSequence{
	
	public static void main(String[] args){
		int count[] = {5,1,1,1};
		int len = count[0]+count[1]+count[2]+count[3];
		//StringBuffer out = new StringBuffer(" ");
		//System.out.println(out.length());
		generate("",len,count);
		
	}
	
	public static boolean generate(String out,int len,int[] count){
		if(out.length() == len){
			System.out.println(out);
			return true;
		}
		int i=0;
		while(i<count.length){
			int c;
			if(!out.isEmpty())
				 c = out.charAt(out.length()-1)-'0';
			
			if( (count[i-1]>0) && (out.isEmpty()||(out.charAt(out.length()-1)-'0' != i))){
				
				count[i-1] =count[i-1]-1;
				generate(out+i,len,count);
		
				count[i-1] = count[i-1]+1;
			}
			//i=(i+1)%count.length;
			i++;
		}
		return false;
	}
}