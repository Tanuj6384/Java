package H_Arrays_QPs;
import java.util.*;
public class B_Max_Min_Diiference_SPAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the value");
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		max_min(arr);	
	}
	public static void max_min(int [] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length; i++) {
			if(arr[i]>max) {
			max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}		
		}
		System.out.println("max-min");
		int span=max-min;
		System.out.println(span);
		}
	}
/*  Enter the size
	5
	Enter the value
	2 3 4 5 50
	max-min
	48        */