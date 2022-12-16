package Java.Arrays;

public class sorted_1s {
    public static void main(String[] args) {
        int [] arr={1,0,0,1,1,0,1,0};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int [] arr){
        int zero=0; 
        int one=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zero++;
            }
            if(arr[i]==1){
                one++;
            }
        }
        for(int i=0; i<zero; i++){
            arr[i]=0;
        }
        for(int i=zero; i<zero+one; i++){
            arr[i]=1;
        }
        
    }
}
