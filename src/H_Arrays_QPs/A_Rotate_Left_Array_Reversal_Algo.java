package H_Arrays_QPs;

import java.util.Scanner;

public class A_Rotate_Left_Array_Reversal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the Element");
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter d = ");
		int d=sc.nextInt();
		rotate(arr,d);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void rotate(int [] arr, int d) {
		d=d%arr.length;
		int n=arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	public static void reverse(int [] arr, int i, int j) {
		while (i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	

}
