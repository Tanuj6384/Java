package K_Strings;
import java.util.*;

public class D_ASCII_Diff_Two_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(sol(str));		
	}
	public static String sol(String str) {
		StringBuilder sb=new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i=1; i<str.length(); i++) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			int gap=curr-prev;
			
			sb.append(gap);
			sb.append(curr);
		}
		return sb.toString();
	}
/*
abdgca
a1b2d3g-4c-2a
 */

}
