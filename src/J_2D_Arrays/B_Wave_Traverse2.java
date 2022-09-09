package J_2D_Arrays;
public class B_Wave_Traverse2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12},
				      {13,14,15,16}};
		for (int j=0; j<arr[0].length; j++) {
			if(j%2==0) {
				for (int i=arr.length-1; i>=0; i--) {
					System.out.println(arr[i][j]);
				}
			}
			else {
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
/*
 13
9
5
1

2
6
10
14

15
11
7
3

4
8
12
16
*/
