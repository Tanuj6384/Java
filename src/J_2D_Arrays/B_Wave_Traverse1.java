package J_2D_Arrays;

import java.util.Scanner;

public class B_Wave_Traverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]arr=new int[row][col];
	    System.out.println("Enetr matrix");
	    for(int i=0; i<arr.length; i++) {
	    	for (int j=0; j<arr[0].length; j++) {
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    for(int j=0; j<arr[0].length; j++) {
	    	if(j%2==0) {
	    		for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i][j]);
				}
	    	}
	    	else {
	    		for (int i=arr.length-1; i>=0; i--) {
	    			System.out.println(arr[i][j]);
	    		}
	    	}
	    	System.out.println();
	    }
	}
	/*
Enter size
4
4
Enetr matrix
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
1
5
9
13

14
10
6
2

3
7
11
15

16
12
8
4
	 */
	

}
