package E_Question;
import java.util.Scanner;

public class D_PirmeNo_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		
		for (int i=2; i<n; i++) {
			if(n%i == 0) {
				isPrime=false;
				break;
			}
		}
		if(n<2) {
			isPrime=false;
		}
		System.out.println(isPrime);
		

	}

}
