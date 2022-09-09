package H_Arrays_QPs;

import java.util.Scanner;

public class A_Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the value");
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		reverse(arr);
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
		

	}
	public static void reverse(int [] arr) {
		int i=0;
		int j=arr.length-1;
		while (i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		
	}
	

}
