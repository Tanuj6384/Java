package A_DataTypes;

import java.util.*;

public class Print_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i <=n; i++) {
			
			if(i==0 || i==1) {
				continue;
			}

			int fact = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					fact++;
					break;
				}

			}
			if (fact == 0) {

				System.out.println(i);
			}

		}

	}

}
