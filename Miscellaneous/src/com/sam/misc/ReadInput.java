package com.sam.misc;

import java.io.InputStreamReader;
import java.util.Scanner;


public class ReadInput{
	public static void main(String[] args){
		
	        Scanner scanner = new Scanner(new InputStreamReader(System.in));
	        int i = scanner.nextInt();
	        scanner.nextLine();
	        System.out.println("Number "+i);
	        System.out.println("Reading input from console using Scanner in Java ");
	        System.out.println("Please enter your input: ");
	        String input = scanner.nextLine();
	        System.out.println("User Input from console: " + input);
	        System.out.println("Reading int from console in Java: ");
	        int number = scanner.nextInt();
	        System.out.println("Integer input: " + number);
	      
	    } 
	  

	
}