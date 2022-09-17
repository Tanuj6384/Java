package A_Basic_QPs;

import java.util.Scanner;

public class A_N_prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N no.");
		int n=sc.nextInt();
		System.out.println("Prime no are");
		for(int i=0; i<=n; i++) {
			if(i==0 || i==1) {
				continue;
			}
			int count=0;
			for(int j=2; j*j<=i; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}
}
/*
Enter N no.
10
Prime no are
2
3
5
7
*/
