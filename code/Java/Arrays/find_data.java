package Java.Arrays;

public class find_data {
    public static void main(String[] args) {
        int [] arr={1,4,6,2,6,4,7};
            int data=2;
            sol(arr, data);
    }
    public static void sol(int [] arr,int data){
        int idx=-1;
        for(int i=0; i<arr.length; i++ ){
            if(arr[i]==data){
                idx=i;
                break;
            }
        }
        System.out.println(idx);
    }
}
