package H_Arrays_QPs;
import java.util.Scanner;

public class D_Bar_chart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int [] arr= new int[n];
		System.out.println("enter the element");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
			max=arr[i];
			}
		}
		for(int floor= max; floor>=1; floor--) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>=floor) {
					System.out.print("*\t");
				}	
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
/*	Enter the size
	5
	enter the element
	4 3 5 1 2
			*			
	*		*			
	*	*	*			
	*	*	*		*	
	*	*	*	*	*	
*/