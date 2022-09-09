package J_2D_Arrays;

import java.util.Scanner;

public class D_Exit_Point_0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Size");
		int n=sc.nextInt();
		int m=sc.nextInt();	
		int [][] arr=new int[n][m];
		System.out.println("Enter the Matrix");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		print(arr);	
		}
	public static void print(int [][]arr) {	
		int dir=0; //0=e, 1=s, 2=w, 3=n
		int i=0;
		int j=0;
		while(true) {
			dir=(dir + arr[i][j]) % 4;
			if(dir==0) {//east
				j++;
			}
			else if(dir==1){//south
				i++;
			}
			else if(dir==2) {// west
				j--;
			}
			else if(dir==3) {// north 
				i--;
			}
			// bahar point k liye
			if(i<0) {
				i++;
				break;
			}
			else if(j<0) {
				j++;
				break;
			}
			else if(i==arr.length) {
				i--;
				break;
			}
			else if(j==arr[0].length) {
				j--;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
	}
}
/*

enter Size
4 4
Enter the Matrix
0 0 1 0
1 0 0 0
0 0 0 0
1 0 1 0
1
3

 */
