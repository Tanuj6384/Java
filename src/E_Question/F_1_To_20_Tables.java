package E_Question;

public class F_1_To_20_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=1;
		for(int j=1; j<=10; j++) {
			int tableOf=j;
			for(int i=1; i<=20; i++) {
			result=tableOf*i;
			System.out.print(result+" ");
			}
			System.out.println();
		}

	}

}
