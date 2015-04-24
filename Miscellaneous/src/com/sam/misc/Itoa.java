package com.sam.misc;

public class Itoa{
	/* Adding 2 integers strings and output the 
	  result as a string
	*/
	public static int n = 56473;
	public static String s1 = "7567";
	public static String s2 = "534";
	
	public static void add(String s1, String s2){
		int l1, l2;
		int c =0, sum=0;
		StringBuilder res = new StringBuilder("");
		l1 = s1.length();
		l2 = s2.length();
		if (l1==l2){
			for(int i=l1-1;i>=0;i--){
				sum = c + (int) (s1.charAt(i)-'0') + (int) (s2.charAt(i)-'0');
				if(sum <10){
					c= 0;
					res=res.insert(0,sum);
				}
				else{
					res = res.insert(0,sum%10);
					c=sum/10;
				}
			}
		}
		else{
			int i,j;
			for(i=l1-1,j=l2-1;i>=0&&j>=0;i--,j--){
				sum = c + (int) (s1.charAt(i)-'0') + (int) (s2.charAt(j)-'0');
				
				res = res.insert(0,sum%10);
				c= sum/10;
				
				
			}
			if(i==-1){
				while(j >=0){
					sum = c + (int) (s2.charAt(j)-'0');
					res = res.insert(0,sum%10);
					c = sum/10;
					j--;
				}
				
			}
			else{
				while(i >=0){
					sum = c + (int) (s1.charAt(i)-'0');
					res = res.insert(0,sum%10);
					c = sum/10;
					i--;
				}
			}
		}
		System.out.println("SUM IS: "+res);
		
	}
	
	
	public static void main(String[] args){
		/*int r;
		String res = "";
		while(n>=1){
			r = n%10;
			n=n/10;
			res = r+res;
		}
		System.out.println(res); */
		
		add(s1,s2);
		
	}
}