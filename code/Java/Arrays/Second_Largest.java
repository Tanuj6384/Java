package Java.Arrays;

import java.util.*;

public class Second_Largest {
    public static void main(String[] args) {
        
    int [] arr ={1,3,4,5,8,8};
   int largest=Integer.MIN_VALUE;
   int second=Integer.MIN_VALUE;
   for(int i=0; i<arr.length; i++){
    if(largest<arr[i]){
        second=largest;
        largest=arr[i];
    }
    if(arr[i]>second && arr[i]<largest){
        second =arr[i];
    }
   }
   System.out.println(second);
        }
    }




  
