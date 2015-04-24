package com.sam.arrays;

public class SmallestStringLargerThanSearch{
	
	public static void main(String[] args){
		char[] str = {'c','f','j','p','v'};
		char c; 
		c = 'a';
		System.out.println("The smallest char larger than "+c+" is: "
				+getSmallestLargerChar(str,c));
		c = 'c';
		System.out.println("The smallest char larger than "+c+" is: "
				+getSmallestLargerChar(str,c));
		c = 'k';
		System.out.println("The smallest char larger than "+c+" is: "
				+getSmallestLargerChar(str,c));
		c = 'z';
		System.out.println("The smallest char larger than "+c+" is: "
				+getSmallestLargerChar(str,c));
		
		char[] str2 = {'c','f','k'};
		c = 'f';
		System.out.println("The smallest char larger than "+c+" is: "
				+getSmallestLargerChar(str2,c));
		c = 'c';
		System.out.println("The smallest char larger than "+c+" is: "
				+getSmallestLargerChar(str2,c));
		c = 'd';
		System.out.println("The smallest char larger than "+c+" is: "
				+getSmallestLargerChar(str2,c));
		char arr []={'a','c','e','g','i','j'};
		c = 'f';
		System.out.println("The smallest char larger than "+c+" is: "
				+getSmallestLargerChar(arr,c));
		
		
	}
	
	public static char getSmallestLargerChar(char[] str, char c){
		int n = getCharacter(str,c,0,str.length) ;
		if( n == -1)
			return str[0];
		else
			return str[n];
			
	}
	
	public static int getCharacter(char[]str, char c, int l, int h){
		if(l <h){
			int mid = (l+h)/2;
			if( str[mid] < c){
				if(mid<str.length-1){
					if(str[mid+1] > c)
						return mid+1;
					else
						return getCharacter(str,c,mid+1,h);
				}
				else
					return -1;
			}
				
			
			else if(str[mid] == c){
				return mid +1;
			}
			else{
				if( mid>0){
					if(str[mid-1] <= c)
						return mid;
					else
						return getCharacter(str,c,l,mid-1);
				}
				else
					return -1;
				
			}
			
		}
		if(l==h)
			return l;
		else{
			return -1;
		}
	}
}