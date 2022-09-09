package E_Question;

import java.util.Scanner;

public class E_Series_Sum {
//	1 + 1/2 + 1/3 + 1/4......1/n

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float result=0;
		
		for(float i=1; i<=n; i++) {
			result +=1/i;
		}
		System.out.println(result);

	}

}
