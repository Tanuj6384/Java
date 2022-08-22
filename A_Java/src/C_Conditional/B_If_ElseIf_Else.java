package C_Conditional;

public class B_If_ElseIf_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=28;
		if(num>0 && num<=10) {
			System.out.println("Number is greater than 10");
		}
		else if (num>10 && num<=20) {
			System.out.println( "Number is greater than 10 and less than 20");
		}
		else if (num>20 && num<=30) {
			System.out.println("Number is greater than 20 and less than 30");
		}
		else {
			System.out.println("number is greater than 30");
		}
	}

}
