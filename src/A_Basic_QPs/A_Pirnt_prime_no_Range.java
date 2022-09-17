package A_Basic_QPs;

import java.util.Scanner;

public class A_Pirnt_prime_no_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		
		for(int i=low; i<=high; i++) {
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
