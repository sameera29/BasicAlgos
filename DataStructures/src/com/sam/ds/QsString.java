package com.sam.ds;

public class QsString{
	public static String str = "aldbcfghf";
	public static int f = 0;
	public static int l = str.length()-1;
	public static void swap(StringBuilder str,int f, int l){
		char t;
		//System.out.println("F is:"+f+" and  L: "+l);
		t = str.charAt(f);
		str.setCharAt(f, str.charAt(l));
		str.setCharAt(l,t);
		
	}
	public static int partition(StringBuilder str,int ft, int lt){
		if (ft==lt)
			return ft;
		//int size = (lt-ft)+1;
		int pivot = (lt-ft)/2;
		//int pivot = 3;
		
		//System.out.println("PIVOT "+str.charAt(pivot));
		while(ft<lt){
			while((str.charAt(ft) <= str.charAt(pivot)) && (ft<lt)){
				ft++;
			}
			while((str.charAt(lt) > str.charAt(pivot)) &&(ft<lt) ){
				lt--;
			}
			System.out.println("BEFORE "+str+"  ft "+ft+" lt: "+lt);
			swap(str,ft,lt);
			System.out.println("AFTER:  "+str);
			
		}
		return pivot;
	}
		public static boolean isDuplicate(StringBuilder str, int f, int l){
			/*if(f< l) {
				if(str.charAt(f)==str.charAt(l))
					return true;
				else{
					System.out.println("F < L");
					return false;
				}
					
			}*/
			if (f == l){
				System.out.println("F==L");
				return false;
			}
			int pivot = partition(str,f,l);
			if(isDuplicate(str,f,pivot-1)) {
				System.out.println("1");
				return true;
			}
			if((0<pivot) && str.charAt(pivot-1) == str.charAt(pivot)){
				System.out.println("2");
				return true;
			}
			if(isDuplicate(str,pivot+1,l)){ 
				System.out.println("3");
				return true;
			}
			if((pivot<l) && (str.charAt(pivot) == str.charAt(pivot+1))){
				System.out.println("4");
				return true;
			}
			System.out.println("FINAL");
			return false;
		
		}
		
		public static void main(String[] args){
			StringBuilder str1 = new StringBuilder(str);
			//partition(str1,f,l);
			System.out.println(isDuplicate(str1,f,l));
		}
	
}