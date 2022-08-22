package I_Sorting;

import java.util.Scanner;

public class A_Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int []arr=new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
	int [] arr = {7, 3, 2, 1, 5,-9};
		sort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int [] arr) {
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
	}

}
