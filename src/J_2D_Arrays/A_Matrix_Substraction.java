package J_2D_Arrays;

import java.util.Scanner;

public class A_Matrix_Substraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]= {{8,2,3},
			       {4,5,6,},
			       {7,8,9,1}};
		int b[][]= {{1,2,3},
			       {4,5,1,},
			       {7,8,9,1}};
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {	
			}
		}
		for (int i=0; i<b.length; i++) {
			for(int j=0; j<b[0].length; j++) {	
			}
		}
		int c[][]=new int [n][m];
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				c[i][j]=a[i][j]-b[i][j];
	}
		}
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	}
/*

4 4
7 0 0 
0 0 5 
0 0 0 

*/
	

