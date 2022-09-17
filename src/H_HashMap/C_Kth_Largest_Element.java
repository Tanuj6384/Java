package H_HashMap;
import java.util.*;
public class C_Kth_Largest_Element {
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
		for(int i=0; i<arr.length; i++) {
			if(i<k) {
			pq.add(arr[i]);
			}
			else {
				if(arr[i]>pq.peek()) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
		while (pq.size() > 0) {
			System.out.print(pq.remove()+" ");
		}
	}
}
/*
8
2 10 5 17 7 18 6 4
3 =k
o/p
10 17 18 
*/
