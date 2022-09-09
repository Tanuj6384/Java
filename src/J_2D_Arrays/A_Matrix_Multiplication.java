package J_2D_Arrays;

import java.util.Scanner;

public class A_Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		int col =sc.nextInt();
		int [][]a=new int [row][col];
		int [][]b=new int [row][col];
		int [][]c=new int [row][col];
		System.out.println("Matrix A");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix B");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				b[i][j]=sc.nextInt();
			}
		}
	
		for(int k=0; k<row; k++) {
				int j;
				c[i][j]=c[k][j]+a[i][k];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		
	}
}