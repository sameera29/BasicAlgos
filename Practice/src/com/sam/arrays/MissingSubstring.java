package com.sam.arrays;

public class MissingSubstring{
	public static boolean isMissing = false;
	
	public static void findMissing(String s){
		boolean isMissing = false;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		int i;
		
		for( i=1;i<s.length()/2;i++){
			if(compare(s,sb,i,sb.length())){
				break;  //Found the substring
			}
			else {
				sb.append(s.charAt(i));
				
			}
		}
		System.out.println("The substrings are: ");
		int len = sb.length();
	
		
		int num = Integer.valueOf(s.substring(0,len));
		i=len;
		while( i+len<=s.length() ){
			if((num+1) == Integer.valueOf(s.substring(i,i+len))){
				i=i+len;
				continue;
			}
			else if( (num+1) == Integer.valueOf(s.substring(i,i+len+1)) ){
				len = len+1;
				i=i+len;
				continue;
			}
			else if(isMissing == false){
				System.out.println("Missing: "+(num+1));
				num=num+1;
				isMissing = true;
				continue;
			}
			else{
				System.out.println("More than 1 missing Invalid!!!");
				break;
			}
				
			
		}
		
	}
	
	public static boolean compare(String s, StringBuilder sb, int i, int len){
		//Return true if the difference of 
		//substr from i to cur substring length and cur substring and the next 
		//section of substring is equal
		
		int num = Integer.valueOf(sb.toString());
		
		int a = Integer.valueOf(  s.substring(i,i+len) );
		int b = Integer.valueOf( s.substring(i+len, i+2*len ) );
		

		if( (a-num) ==1){
			if( ( b-a) == 1)
				return true;
			else if((b-a)==2)
				return true;
			else if( (b*10 - a) <=2)
				return true;
			else 
				return false;
			
		}
		else if ((a-num) == 2){
			if( (b-a)== 1)
				return true;
			else if( (b*10 -a) ==1)
				return true;
			else
				return false;
		}
		else 
			return false;
	}
	
	public static void main(String[] args){
		//String s = "625626628";
		String s = "9979981000";
		//System.out.println(s.charAt(0));
		findMissing(s);
		
	}
}