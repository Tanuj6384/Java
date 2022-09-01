package H_Arrays;

import java.util.Scanner;

public class A_Average_marks_Student {
	// 1 2 3 4 5 = 3
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of student");
		int n=sc.nextInt();
		int [] marks = new int [n];
		
		System.out.println("Enter the marks");
		
		for (int i=0; i<marks.length; i++) {
			marks[i]=sc.nextInt();
		}
		int avgMarks = 0;
		for (int i=0; i<marks.length; i++) {
			avgMarks += marks [i];
		}
		avgMarks/=n;
		System.out.print(avgMarks);

	}

}
