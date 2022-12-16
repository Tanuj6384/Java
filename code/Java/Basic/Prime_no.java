package Java.Basic;
import java.util.*;
public class Prime_no {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0; i<n; i++){
        if( i==0 || i==1){
            continue;
        }
        int count=0;
        for(int j=2; j*j<=i; j++) {
            if(i%j==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println(i);
        }
       }
    }
}
