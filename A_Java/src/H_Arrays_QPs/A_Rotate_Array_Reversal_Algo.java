package H_Arrays_QPs;

public class A_Rotate_Array_Reversal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		int k=3;
		rotate(arr,k);
		for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
	}
	public static void rotate(int [] arr, int k) {
		k=k%arr.length;
		int n=arr.length;
		reverse(arr,n-k,n-1);// k=1 ko reverse
		reverse(arr,0,n-k-1);// 
		reverse(arr,0,n-1);  // hole kp reverse
	}
	public static void reverse(int []arr, int i, int j) {
		while (i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
