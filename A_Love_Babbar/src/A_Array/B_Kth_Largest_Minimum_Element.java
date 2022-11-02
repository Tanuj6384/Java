package A_Array;

import java.util.*;
public class B_Kth_Largest_Minimum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		small(arr,k);
		
	}
	public static void small(int [] arr, int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			pq.add(arr[i]);
		}
		for(int i=k; i<arr.length; i++) {
			pq.add(arr[i]);
			if(pq.peek()<arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		System.out.println(pq.peek());
	}
}