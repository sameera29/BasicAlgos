package com.coding.challenge;

public class BottlesOfBeer{
	public static String[] unit = { " bottle of beer", " bottles of beer"};
	public static String where = " on the wall";
	public static String zero = "no more";
	public static String doWhat = "Take one down and pass it around, ";
	public static String whenZero = "Go to the store and buy some more, ";
	public static int beers = 99;
	
	public static void printLyrics(int beers){
		if(beers == 1){
			System.out.println(beers+unit[0]+where+", "+beers+unit[0]+",");
			System.out.println(doWhat+zero+unit[1]+where+".");
		}
		else if(beers==0){
			System.out.println(zero+unit[1]+where+", "+zero+unit[1]+".");
			beers=99;
			System.out.println(whenZero+beers+unit[1]+where+".");
		}
		else{
			System.out.println(beers+unit[1]+where+", "+beers+unit[1]+".");
			System.out.println(doWhat+(beers-1)+unit[1]+where+".");
		}
	}
	
	public static void main(String args[]){
		int beers = 99;
		for ( int i=beers;i>=0;i--){
			printLyrics(i);
			System.out.println("\n");
		}
	}
}