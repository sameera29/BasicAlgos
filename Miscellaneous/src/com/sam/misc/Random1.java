package com.sam.misc;

import java.io.InputStreamReader;
import java.util.Scanner;


public class Random1{
    public static int check[] = new int[256];
    public static int flag[] = new int[256];
    public static void main(String args[]){
        int i;
        String str;
        //Initialize check and flag
        for(i =0;i<256;i++){
            check[i]=0;
            flag[i]=0;
        }
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int t = in.nextInt();
        in.nextLine();
        for ( i=0; i<t-1;i++){
        	System.out.println("Enter String "+i);
        	str = in.nextLine();
            examineRock(str);
        }
        System.out.println("Enter LAST String ");
         str = in.nextLine();
        System.out.println(countGems(str,t));
        in.close();
    }
    public static void examineRock(String str){
        int i;
        int ind;
        int len = str.length();
      
            for (i =0; i<len; i++){
                ind = (int) str.charAt(i);
                if(flag[ind] == 0){                     //if duplicate in current rock then ignore else increment count
                	flag[ind] =1;              
                    check[ind] = check[ind]+1;
                   
                }
            }
            for (i=0;i<256;i++){
                flag[i] = 0;
            }
        
        
    }
    
    public static int countGems(String str, int t){
        int i,len,count,ind;
        count = 0;
        len = str.length();
        for(i=0; i<len;i++){
            ind = (int) str.charAt(i);
            if(flag[ind] == 0){
            	
                flag[ind] = 1;
                if(check[ind] == (t-1)){
                    count++;
                }
            }
        }
        return count;
    }
}