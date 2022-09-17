package H_HashMap;
import java.util.*;
public class A_Highest_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<Character, Integer> mp=new HashMap<>();
		for (int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(mp.containsKey(ch)) {
				int of=mp.get(ch);
				int nf=of+1;
				mp.put(ch, nf);
			}
			else {
				mp.put(ch,1);
			}
		}
		char mfc=str.charAt(0);
		for(Character key: mp.keySet()) {
			if(mp.get(key)>mp.get(mfc)) {
				mfc=key;
			}
		}
		System.out.println(mfc);
	}
}
/*
abracadabra
o/p
a
*/
