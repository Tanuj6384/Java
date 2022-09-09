package H_Arrays_QPs;

/*
 5
1 2 3 4 5
4
Fisrt3
last3
*/

import java.util.Scanner;

public class E_Fisrt_and_Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println("Fisrt"+ first(arr,x));
		System.out.println("last"+ last(arr,x));

	}
	public static int first(int [] arr, int x) {
		int low =0; 
		int high=arr.length-1;
		int res=0;
		while (low<=high) {
			int mid=(low+high)/2;
			if(x>arr[mid]) {
				low=mid+1;
			}
			else if(x<arr[mid]) {
				high=mid-1;
			}
			else {
				res=mid;
				high=mid-1;
			}
		}
		return res;
	}
	public static int last(int [] arr, int x) {
		int low =0; 
		int high=arr.length-1;
		int res=0;
		while (low<=high) {
			int mid=(low+high)/2;
			if(x>arr[mid]) {
				low=mid+1;
			}
			else if(x<arr[mid]) {
				high=mid-1;
			}
			else {
				res=mid;
				low=mid+1;
			}
		}
		return res;
	}
}
