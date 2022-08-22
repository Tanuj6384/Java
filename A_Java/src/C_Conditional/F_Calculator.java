package C_Conditional;
import java.util.Scanner;

public class F_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b= sc.nextInt();
		
		System.out.println("Enter operation");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		
		int ans=0;
		switch(operation) {
		case '+' : 
			ans = a+b;
			break;
		case '-' :
			ans = a-b;
			break;
		case '*' :
			ans = a*b;
			break;
		case '/' :
			ans = a/b;
			break;
		default :
			System.out.println("INVALID");
		}
		System.out.println(ans);
		

	}

}
