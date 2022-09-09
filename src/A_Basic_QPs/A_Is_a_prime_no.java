package A_Basic_QPs;

import java.util.Scanner;

public class A_Is_a_prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int t=sc.nextInt();
		for (int i=0; i<=t; i++) {
			int n=sc.nextInt();
			
			int count=0;
			for(int div=2; div*div<=n; div++) {
				if(n%div==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not prime");
			}
		}

	}

}
