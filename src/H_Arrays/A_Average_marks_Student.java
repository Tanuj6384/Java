package H_Arrays;

public class A_Average_marks_Student {
	// 1 2 3 4 5 = 3
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,15};
		
		int avg=0;
		for (int i=0; i<arr.length; i++) {
			avg+=arr[i];
		}
		avg=avg/arr.length;
		System.out.println(avg);
	}

}
