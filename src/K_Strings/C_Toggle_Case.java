package K_Strings;
/*
 'p'-'a' = 'P'-'A'
 'p'='a' + 'P'-'A'
 'P'='A' + 'p'-'a'
 */
import java.util.Scanner;

public class C_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(toggleCase(str));
	}
	public static String toggleCase(String str) {
		StringBuilder sb=new StringBuilder(str);
		for(int i=0; i<str.length(); i++) {
		char ch=str.charAt(i);
		if(ch>='a' && ch<='z') {
			char uppercase=(char)('A'+ch-'a');
			sb.setCharAt(i, uppercase);
		}
		else if(ch>='A' && ch<='Z') {
			char lowercase=(char)('a'+ch-'A');
			sb.setCharAt(i, lowercase);
		}
		}
		return sb.toString();
	}
}
/*
pepCODING
PEPcoding
*/