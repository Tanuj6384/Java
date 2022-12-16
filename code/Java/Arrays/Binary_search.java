package Java.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        int [] arr={1,3,6,4,5,7,8};
        int data=7;
        sol(arr, data);
    }
    public static int sol(int [] arr, int data){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==data){
                System.out.print(mid);
                break;
            }
            else if(arr[mid]<data){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        return -1;
    }
}
