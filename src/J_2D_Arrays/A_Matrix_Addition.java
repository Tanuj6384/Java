package J_2D_Arrays;

import java.util.Scanner;

public class A_Matrix_Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		int b[][]=new int[row][col];
		System.out.println("Matrix A");
		for (int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix B");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[row][col];
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			}
	}
}
/*
Enter the matrix
2 3
Matrix A
3 2 -1
4 7 2
Matrix B
9 -1 -3
4 5 6
output
12 1 -4 
8 12 8 
*/