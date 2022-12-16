package Java.Arrays;
public class Max_min {
    public static void main(String[] args) {
        int [] arr={2,3,5,8,1};
        sol(arr);
    }
    public static void sol(int [] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max+" "+ min);
        int span=max-min;
        System.out.print(span);
    }
}
