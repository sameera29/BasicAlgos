package com.sam.ds;
public class ReverseString{
		public static String str = "Do or do not, there is no try.";
		
		public static void swap(StringBuilder str, int f, int l){
			char t = str.charAt(f);
			str.setCharAt(f, str.charAt(l));
			str.setCharAt(l, t);
		}
		public static void reverse(StringBuilder str1){
			int f = 0;
			int l=str1.length()-1;
			while (f<l){
				swap(str1,f,l);
				f++;
				l--;
			}
			System.out.println("Reverse:"+str1 );
		}
		public static void reverseInPlace(String str){
			int len = str.length();
			StringBuilder s2 = new StringBuilder("");
			char[] s = new char[len];
			int start=0;
			int cur=len-1;
			int end = 0,i=0;
			while(i<len)
			{
				while((i<len)&&(str.charAt(i)!= ' ')){
					
					i++;
				}
				for(end = i-1;end>=start;end--){
					s[cur] = str.charAt(end);
					
					cur--;
					
				}
				if(i<len){
					s[cur]= str.charAt(i);
					cur--;
					i++;
					start=i;
				}
			}
			
			for(int j =0;j<len;j++){
				s2.append(s[j]);
			}
			System.out.println(s2);
		}
		
		public static void main(String[] args){
			
			StringBuilder str1 = new StringBuilder(str);
			//reverse(str1);
			reverseInPlace(str);
		}
}