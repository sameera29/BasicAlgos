package com.sam.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{
	public static String file = "/Users/vbandhakavi/Documents/names.txt";
	
	
	public static void writeToFile(){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/vbandhakavi/Documents/fileOutput.txt"));
			bw.append("HelloWorld");
		
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String args[]){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			//InputStreamReader reader2= new InputStreamReader(new FileReader(file));
			String line = "";
			while ( (line = reader.readLine()) != null){
				System.out.println(line);
			}
			writeToFile();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}