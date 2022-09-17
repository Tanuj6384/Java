package H_Arrays;

public class B_Copy_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] original= {10,20,30,40,50};
		int [] copy=original;
		System.out.println("This is original");
		//original[2]=222;
		for (int i=0; i<original.length; i++) {
			System.out.print(original[i]+" ");
		}
		System.out.println();
		System.out.println("This is copy");
		for (int i = 0; i < copy.length; i++) {		
			System.out.print(copy[i]+" ");
		}

	}

}
