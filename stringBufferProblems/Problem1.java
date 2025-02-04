package stringBufferProblems;
import java.util.*;
public class Problem1{

    public static String concat(String arr[]){
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            ans.append(arr[i]);
        }
        return String.valueOf(ans);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        System.out.println("enter 5 strings : ");
        for(int i=0;i<5;i++){
            arr[i]=sc.next();
        }
        System.out.print("concated strings is: "+concat(arr));



    }
}