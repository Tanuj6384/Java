package H_HashMap;
import java.util.*;
public class D_Kth_Sort_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0; i<=k; i++) {
			pq.add(arr[i]);
		}
		for(int i=k+1; i<arr.length; i++) {
			System.out.print(pq.remove()+" ");
			pq.add(arr[i]);
		}
		while(pq.size() > 0) {
			System.out.print(pq.remove()+" ");
		}
	}
}
/*
9
2 3 1 4 6 7 5 8 9
3
O/P
1 2 3 4 5 6 7 8 9 
*/
