package H_Arrays_QPs;

import java.util.Scanner;

public class E_Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the element");
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("find data");
		int data=sc.nextInt();
		//System.out.println(binarySearch(arr,data));
		binarySearch(arr,data);
	}
	public static int binarySearch(int [] arr, int data) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid =(low+high)/2;
			if(data>arr[mid]) {
				low=mid+1;
			}
			else if(data<arr[mid]) {
				high=mid+1;
			}
			else {
				System.out.println(mid);
				return mid;
			}
		}
		return -1;
	}

}
