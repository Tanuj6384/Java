package H_Arrays_QPs;

import java.util.Scanner;

// WAP to print array element in  reverse order

public class A_Reverse_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total size");
		int n =sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element "+ (i+1-1));
			arr[i] = sc.nextInt();
		}
		reverse(arr);
		
	}
	public static void reverse(int [] arr) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
