package H_Arrays_QPs;

import java.util.Scanner;

public class C_Find_element_in_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element");
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Search element");
		int data=sc.nextInt();
		search(arr,data);	
	}
	public static void search(int [] arr, int data) {
		int idx=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==data) {
				idx=i;
				break;
			}
		}
		System.out.println(idx);
	}	
}
/*	Enter the size
	5
	Enter the element
	1 2 3 4 5
	Search element
	2
	1
*/