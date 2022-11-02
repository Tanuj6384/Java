package A_Array;
import java.util.*;
public class C_Move_Negative_to_One_Side_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		sol(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
//		Arrays.toString(arr);
	}
	public static void sol(int [] arr) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			if(arr[left]<0 && arr[right]<0) {
				left++;
			}
			if(arr[right]>0 && arr[right]>0) {
				right--;
			}
			else if(arr[left]>0 && arr[right]<0) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
	}
}
/*
9
-12 11 -13 -5 6 -7 5 -3 -6
O/P
-12 -6 -13 -5 -3 -7 5 6 11 
*/
