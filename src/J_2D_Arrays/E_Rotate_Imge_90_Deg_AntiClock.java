package J_2D_Arrays;

import java.util.Scanner;

public class E_Rotate_Imge_90_Deg_AntiClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] arr=new int[n][m];
		System.out.println("Enter The Matrix");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		transpose(arr);
		System.out.println("left Rotate 90");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	// Transpose
	public static void transpose(int [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
			}
		}
		System.out.println("Transpose");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		// Reverse
		for (int j=0; j<arr[0].length; j++) {
		int li=0;
		int ri=arr[0].length-1;
		while(li<ri) {
			int temp=arr[li][j];
			arr[li][j]=arr[ri][j];
			arr[ri][j]=temp;
			li++;
			ri--;
		}
		}
	}
}
/*
 
Enter Size
3 3
Enter The Matrix
1 2 3
4 5 6
7 8 9
Transpose
1 4 7 
2 5 8 
3 6 9 
left Rotate 90
3 6 9 
2 5 8 
1 4 7 
 
*/
