package A_DataTypes;
import java.util.Scanner;

public class C_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
//		int x= sc.nextInt();
//		double y = sc.nextDouble();
//		String str = sc.nextLine();
// --------------------------------------------------------------------------------
     //  simple interest
		
//		int principal = 5000;
//		float rate = 12.5f;
//		int time = 12;
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principal * rate * time / 100;
		System.out.println(simpleInterest);
		

	}

}
