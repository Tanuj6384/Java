package J_2D_Arrays;

import java.util.Scanner;

public class C_Spiral_AntiClock_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] arr=new int[n][m];
		System.out.println("Enter the element");
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		
		int total=n*m;
		int count =0;
		while (count<total) {
		// left wall
		for(int i=minr,j=minc; i<=maxr && count<total; i++) {
			System.out.println(arr[i][j]);
			count++;
		}
		minc++;
		//bottom wall
		for(int i=maxr,j=minc; j<=maxc && count<total; j++) {
			System.out.println(arr[i][j]);
			count++;
		}
		maxr--;
		//right wall
		for (int i=maxr, j=maxc; i>=minr && count<total; i--) {
			System.out.println(arr[i][j]);
			count++;
		}
		maxc--;
		// top wall
		for (int i=minr, j=maxc; j>=minc && count<total; j--) {
			System.out.println(arr[i][j]);
			count++;
		}
		minr++;	
	}
	}
}
/*
 
Enter size
4 4
Enter the element
1 2 3 4
5 6 7 8 
9 10 11 12
13 14 15 16
1
5
9
13
14
15
16
12
8
4
3
2
6
10
11
7

*/
