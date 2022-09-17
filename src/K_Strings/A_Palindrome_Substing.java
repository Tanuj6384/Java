package K_Strings;

import java.util.Scanner;

public class A_Palindrome_Substing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		substring(str);	
	}
	// substring
	public static void substring(String str) {
		for(int i=0; i<=str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				String ss=str.substring(i,j);
				if(ispalindrome(ss)==true) {
					System.out.println(ss);
				}
			}
		}
	}
	// palindrome
	public static boolean ispalindrome(String ss) {
		int i=0; 
		int j=ss.length()-1;
		while(i<=j) {
			char ch1=ss.charAt(i);
			char ch2=ss.charAt(j);
			if(ch1 != ch2) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
/*
n
nitin
i
iti
t
i
n
*/