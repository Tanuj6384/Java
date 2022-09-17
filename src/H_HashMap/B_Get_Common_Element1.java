package H_HashMap;
import java.util.*;
public class B_Get_Common_Element1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int [] a1=new int[n1];
		for(int i=0; i<a1.length; i++) {
			a1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int [] a2=new int [n2];
		for(int i=0; i<a2.length; i++) {
			a2[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int val:a1) {
			if(hm.containsKey(val)) {
				int of=hm.get(val);
				int nf=of+1;
				hm.put(val, nf);
			}
			else {
				hm.put(val, 1);
			}
		}
		for(int val: a2) {
			if(hm.containsKey(val)) {
				System.out.print(val+" ");
				hm.remove(val);
			}
		}
	}
}
/*
7
1 1 2 2 2 3 5
7
1 1 1 2 2 4 5
o/p
1 2 5 
*/