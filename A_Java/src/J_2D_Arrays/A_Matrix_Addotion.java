package J_2D_Arrays;

import java.util.Scanner;

public class A_Matrix_Addotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the dimension");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a [] []= new int [row][col];
		int b [] [] =new int [row][col];
		
		System.out.println("Enter a");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				a[i][j]=sc.nextInt();
			}
		}	
		System.out.println("Enter b");
		for(int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int [row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				c [i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("C is result");
		for(int i=0;  i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.println(c[i][j] +" ");
			}
			System.out.println();
		}
//    Enetr the dimension
//		2 3
//    Enter a
//		3 2 -1
//		4 7 2
//    Enter b
//		9 -1 -3
//		4 5 6
//    C is result
//		12 
//		1 
//		-4 
//
//		8 
//		12 
//		8 
//	

	}

}
