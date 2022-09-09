package J_2D_Arrays;

import java.util.*;

public class C_Spiral_Clock_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int [n][m];
		System.out.println("Enter Matrix");
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		print(arr, n, m);

	}
	public static void print(int [][]arr, int n, int m) {
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		
		int total=n*m;
		int count=0;
		
		while(total>count) {
		// Top wall
		for (int i=minr, j=minc; j<=maxc &&total>count; j++) {
			System.out.println(arr[i][j]);
			count++;
		}
		minr++;
		// rigth wall
		for (int i=minr,j=maxc; i<=maxr &&total>count; i++) {
			System.out.println(arr[i][j]);
			count++;
		}
		maxc--;
		//bottom wall
		for (int i=maxr, j=maxc; j>=minc &&total>count; j--) {
			System.out.println(arr[i][j]);
			count++;
		}
		maxr--;
		// left wall
		for (int i=maxr, j=minc; i>=minr &&total>count; i--) {
			System.out.println(arr[i][j]);
			count++;
		}
		minc++;
		}
	}

}
/*

Eneter the size
4 5
Enter Matrix
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
1
2
3
4
5
10
15
20
19
18
17
16
11
6
7
8
9
14
13
12

*/