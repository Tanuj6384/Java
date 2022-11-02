package A_Array;
import java.util.Scanner;
public class B_Max_and_Min_Element {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		min_max(arr);
	}
	public static void min_max(int [] arr) {
		int min=arr[0];
		int max=0;
		for(int i=0; i<arr.length; i++) {
//			min=Math.min(min,arr[i]);
//			max=Math.max(max,arr[i]);
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("min = "+min +", "+"max = "+max);
	}
}
/*
5
6 4 18 1 7
o/p
min = 1, max = 18
*/