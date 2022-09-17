package H_ArrayList;
import java.util.*;
public class B_Remove_All_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a1=new ArrayList<>();
		for(int i=0; i<n; i++) {
			a1.add(sc.nextInt());
		}
		sol(a1);
		System.out.println(a1);
	}
	public static boolean ispalindrome(int val) {
		for(int j=2; j*j<=val; j++) {
			if(val%j==0) {
				return false;
			}
		}
		return true;
	}
	public static void sol(ArrayList<Integer> a1) {
		for (int i=a1.size()-1; i>=0; i--) {
			int val=a1.get(i);
			if(ispalindrome(val) == true) {
				a1.remove(i);
			}
		}
	}
}
/*
5
7 4 5 6 13
o/p
[4, 6]
*/
