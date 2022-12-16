package Java.Arrays;
import java.util.*;
public class Rotate_Array_left {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotate(arr,k);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int [] arr, int k){
        k=k%arr.length;
        int n=arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr, 0,n-1);
    }
    public static void  reverse(int [] arr, int i, int j){
       
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        }
    
