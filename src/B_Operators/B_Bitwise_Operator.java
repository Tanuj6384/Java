package B_Operators;

public class B_Bitwise_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AND                            OR
	// X  Y = XY                    X  Y = XY
	// 0  0 = 0                     0  0 = 0
	// 0  1 = 0                     0  1 = 1
	// 1  0 = 0                     1  0 = 1
    // 1  1 = 1                     1  1 = 1
		int a = 2;
		int b = 3; 
		int c = a & b;
		int d = a | b;
		System.out.println(c);
		System.out.println(d);

	}

}
