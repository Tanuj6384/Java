package E_Question;
import java.util.Scanner;

public class C_power {
	//a^b=a*a*a*a*.......btimes.....*a
	// a^2= a*a
	// a^3= a*a*a
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=1;
		for(int i=0; i<b; i++) {
			result *=a;
		}
		System.out.println(result);
		
	}

}
