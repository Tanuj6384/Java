package F_Patterns;
import java.util.Scanner;
public class A_Pattern1 {
//	4
//	* * * * 
//	* * * * 
//	* * * * 
//	* * * * 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for (int j=1; j<=n; j++) {
			for(int i=1; i<=n; i++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
