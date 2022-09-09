package J_2D_Arrays;

public class G_Diagonal_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr = {{1,2,3},
				         {4,5,6},
				         {7,8,9}};
		for (int gap=0; gap<arr.length; gap++) {
			for (int i=0, j=gap; j<arr.length; i++,j++) {
				System.out.println(arr[i][j]+" ");
			}
		}
	}
}
/*
1 
5 
9 
2 
6 
3 
*/