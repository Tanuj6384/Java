package A_Array;
import java.util.*;
public class A_Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<arr.length; i++) {
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
		while(i<j) {
			int temp=arr[i]; 
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
/*
5
1 2 3 4 5
o/p
5 4 3 2 1 
*/
