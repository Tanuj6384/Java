package H_Arrays;
import java.util.*;

public class B_Array_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size");
		int n=sc.nextInt();
		int arr []= new int[n];
		System.out.println("Enter value");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();			
	   }
		Sum(arr);
   }
	public static void Sum(int [] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.print("sum = " + sum);
		
		
	}
}