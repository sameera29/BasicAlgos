package com.sam.misc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleRead{
	public static void main(String[] args){
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		while(true)
			System.out.println(scanner.nextLine());
		
	}
}