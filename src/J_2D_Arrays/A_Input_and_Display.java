package J_2D_Arrays;
import java.util.*;
public class A_Input_and_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); // row
		int m=sc.nextInt(); // col
		int [][] arr=new int [n][m];
		
		//Take input
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		// print 
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			/*
				 Size
					3 4
					1 2 3 4
					4 3 2 1
					7 4 1 2
			output	1 2 3 4 
				4 3 2 1 
				7 4 1 2 
			 */
		}

	}

}
