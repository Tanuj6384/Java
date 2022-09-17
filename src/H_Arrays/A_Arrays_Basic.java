package H_Arrays;

public class A_Arrays_Basic {
// Arrays is a Data Structure that is used to store multiple value
// in a single variable, instead of declaring seprate variable for each value.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		dataType [] arrayName;
//		arrayName = new dataType [n];
//                    or
//     dataType [] arrayName =new dataType [n];
//-----------------------------------------------------------
//		int [] marks;
//		marks=	new int[10];
////		        or 
//	    int [] marks = new int [10];
//	    System.out.println(marks[2]);
//--------------------------------------------------------------
		int [] age = {1, 3, 4, 5, 8};
		double [] marks = {1.0, 3.9, 4.8, 7.7};
		age [3] = 44;
		System.out.println(age[3]);
	
 		for (int i=0; i<marks.length; i++) {
 			System.out.println(marks[i]);
 		}
		
	}

}
