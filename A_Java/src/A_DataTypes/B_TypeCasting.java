// Type casting is when you assign a value of one primitive data type to another type
// Two types 1: Automatic Typecast 
//          2: Mannual typecast
// 1) byte > short > char > int > long >float > double
package A_DataTypes;

public class B_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1) Automatic Typecast 
//		int x = 10;
//		double y = x;
//		System.out.println(y);
//------------------------------------------------------------
		
		double myDouble = 3.2547;
		int myInt = (int)myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);

	}

}
