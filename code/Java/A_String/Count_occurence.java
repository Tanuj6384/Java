package Java.A_String;
import java.util.*;
public class Count_occurence {
    public static void main(String[] args) {
        String str="";
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        sol(str);
    }
    
    public static void sol(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
             count =0;
            char ch=str.charAt(i);

            for(int j=0; j<str.length(); j++){
                char c=str.charAt(j);
                if(ch==c){
                    count++;
                }
            }
            System.out.println(ch+" "+ count);
        }
    }
    
}
