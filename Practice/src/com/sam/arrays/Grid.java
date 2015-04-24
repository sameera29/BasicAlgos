package com.sam.arrays;

public class Grid{
	
	public static int a[][] = new int[4][4];
	
	public static void initialize(){
		a[0][0] = 1;
		a[0][1] = 1;
		a[0][2] = 0;
		a[0][3] = 0;
		a[1][0] = 1;
		a[1][1] = 0;
		a[1][2] = 0;
		a[1][3] = 0;
		a[2][0] = 1;
		a[2][1] = 1;
		a[2][2] = 1;
		a[2][3] = 1;
		a[3][0] = 0;
		a[3][1] = 0;
		a[3][2] = 0;
		a[3][3] = 1;
		
		
	}
	
	public static void printGrid(){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static boolean check(int x, int y, int p, int q){
		if( (x == p) && (y==q)){
			return true;
		}
		
		if( (x>=a.length) || (y>=a[0].length) || (a[x][y]==0) ){
			return false;
		}
		return check(x+1,y,p,q) || check(x,y+1,p,q);
		
		
	}
	
	public static void main(String[] args){
		initialize();
		printGrid();
		System.out.println(check(1,1,3,3));
	}
}