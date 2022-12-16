package Java.Arrays;

import java.util.Arrays;

public class sorted2s {
    public static void main(String[] args) {
        int [] arr={0,1,2,2,1,0};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void sort(int [] arr){
        int start=0, mid=0, end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,end);
                end--;
            }
        }
     //   System.out.print(Arrays.toString(arr));
    }
    public static void swap(int [] arr, int start, int mid){
        int temp=arr[start];
        arr[start]=arr[mid];
        arr[mid]=temp;
    }
    
}
