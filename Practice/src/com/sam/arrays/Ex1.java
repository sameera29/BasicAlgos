package com.sam.arrays;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

// Buy 5 pairs of socks for $4.50
// Buy 5 pairs of socks for $4 2/4

// toFraction
// input 4.50
// output "4 2/4"


// If 0 only show the user 0
// Want the denominator to be 4
// If the numerator is 0 don't show the fraction
// Round nearest policy

// "Sam Price" <sprice@groupon.com>


public class Ex1{


	  public static void main(String[] args) {
	    assertEquals("4 2/4", toFraction(4.50D));
	    assertEquals("4 1/4", toFraction(4.29D));
	    assertEquals("4 1/4", toFraction(4.299D));
	    assertEquals("4", toFraction(4.00D));
	    assertEquals("0", toFraction(0.00D));
	    assertEquals("4 3/4", toFraction(4.756666D));

	  }

	  public static void assertEquals(Object expected, Object actual) {
	    if (expected.equals(actual)) {
	    
	      //System.out.printf("True  %s%s", (Object[]) expected);
	      System.out.println("True "+ expected);
	    } else {
	      //System.out.printf("False expected '%s', actual '%s'%n", expected, actual);
	      System.out.println("False expected "+expected+" , actual  "+actual);
	    }
	  }
	  
	  public static String toFraction(double f){
		int n;   
		double x;
	    StringBuilder s = new StringBuilder();
	    
	    // n is the floor of the decimal number
	    n= (int) Math.floor(f);
	    
	    // Solving for x (the fractional numerator)
	    x= f*4-4*n;
	    
	    // s is the output String that contains the integral and fractional 
	    //part of the decimal number
	    
	    s.append(n);
	    // If the fractional numerator is 0, we need only the 
	    // integer part
	    
	    // If the fractional part cannot
	    // be evenly divided by 4, we round it up
		// or down to the closest integer
	    if(x!=0)		
	    		s.append(" "+Math.round(x)+"/4");    
	    
	    return s.toString();
	  }




}