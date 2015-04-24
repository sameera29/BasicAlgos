package com.sam.arrays;

public class MaxProduct{
	public static int[][] a = new int[5][5];
	
	public static void initialize(){
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 0;
		a[0][3] = -1;
		a[0][4] = 4;
		a[1][0] = 3;
		a[1][1] = 1;
		a[1][2] = 2;
		a[1][3] = 4;
		a[1][4] = 6;
		a[2][0] = 0;
		a[2][1] = 2;
		a[2][2] = 3;
		a[2][3] = 1;
		a[2][4] = 4;
		a[3][0] = 1;
		a[3][1] = 3;
		a[3][2] = 2;
		a[3][3] = 0;
		a[3][4] = 7;
		a[4][0] = 2;
		a[4][1] = 1;
		a[4][2] = 3;
		a[4][3] = 2;
		a[4][4] = 9;
		
		
	}
	
	public static void printGrid(){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	/*
	public static int maxProduct(int x, int y, int max, int prod,int k){
		int p,curMax,hor,ver;
		if( (x>=a.length) || (y >= a[0].length))
			return max;
		if(k == 0)
			return max;
		 p = prod *a[x][y];
		 
		 curMax = Math.max( maxProduct(x+1,y,max,p,k-1), maxProduct(x,y+1,max,p,k-1));
		if(p*curMax > max)
			max = curMax;
		
		return max;
		
		
		
			
	}
	*/
	
	public static int maxProduct( int k){
		int hor = 1,ver =1, diag =1;
		int max = 1;
		
		for(int i=0; i<a.length;i++){
			for( int j=0;j<a[0].length;j++){
				hor =1;
				ver=1;
				diag = 1;
				for( int m = 0;m<k;m++){
					if(i+m <a.length)
						ver = ver *a[i+m][j];
					if(j+m < a[0].length)
						hor = hor*a[i][j+m];
					if( (i+m<a.length) && (j+m <a[0].length) )
						diag = diag*a[i+m][j+m];
				}
				max = Math.max(Math.max(Math.max(  hor,ver  ),diag),max);
			}
		}
		return max;
	}
	
	
	public static void main(String[] args){
		initialize();
		printGrid();
		
		System.out.println("Max Product");
		int k = 4;
		//for( int i = 0;i<a.length;i++){
		//	for(int j =0; j<a[0].length;j++){
				System.out.println(maxProduct(k));
		//	}
		//}
	}
}