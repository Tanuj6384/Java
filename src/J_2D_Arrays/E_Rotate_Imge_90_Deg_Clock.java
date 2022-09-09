package J_2D_Arrays;
import java.util.*;
public class E_Rotate_Imge_90_Deg_Clock {

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
		System.out.println("Right Rotate 90");
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void transpose(int [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		// Reverse
		for (int i=0; i<arr.length; i++) {
			int li=0;
			int ri=arr[i].length-1;
			while(li<ri) {
				int temp=arr[i][li];
				arr[i][li]=arr[i][ri];
				arr[i][ri]=temp;
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
Right Rotate 90
7 4 1 
8 5 2 
9 6 3 

*/
