package E_Question;

import java.util.Scanner;

public class B_Fibbonacci_Numbers {

	public static void main(String[] args) {
//Wap to print fibbonacci series  of n elements where n is input by user
// 0 1 1 2 3 5 8 13 21...........
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a + " ");
		System.out.print(b +" ");
		for(int i=0; i<n-2; i++) {
			int c=a+b; 
			System.out.print(c + " ");
			a=b;
			b=c;
		}
	}

}
