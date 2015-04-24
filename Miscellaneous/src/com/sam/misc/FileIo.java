package com.sam.misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;


public class FileIo{
	
	public static void main(String[] args){
		try {
			String name = "/Users/vbandhakavi/Documents/Eiffel Final.docx";
			InputStream f = new FileInputStream(name);
			
		    char[] c = new char[500];
		    		System.out.println((char) f.read());
		    		System.out.println(c);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}