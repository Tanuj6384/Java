package C_Conditional;

public class D_Nested_If_ElseIf {
	// max of 3 number

	public static void main(String[] args) {
		int a=15, b=13, c=20;
		int result;
		if (a>b) {
			if(a>c) {
				result =a;
			}
			else {
				result = c;
			}
		} else {
		if (b>c) {
			result =b;
		}
		else {
			result=c;
		}
		}
		System.out.println(result);
	}
	
}
