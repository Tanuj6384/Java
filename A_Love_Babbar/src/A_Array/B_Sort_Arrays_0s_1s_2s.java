package A_Array;
import java.util.*;
public class B_Sort_Arrays_0s_1s_2s {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}
	public static void sol(int [] arr) {
		int zero=0; int one=0; int two=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				zero++;
			}
			if(arr[i]==1) {
				one++;
			}
			if(arr[i]==2) {
				two++;
			}
		}
		for(int i=0; i<zero; i++) {
			arr[i]=0;
		}
		for(int i=zero; i<zero+one; i++) {
			arr[i]=1;
		}
		for(int i=zero+one; i<arr.length; i++) {
			arr[i]=2;
		}
	}
}
/*
6
2 0 2 1 1 0
o/p
0 0 1 1 1 2 
*/