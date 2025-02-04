package stringBuilderProblems;
import java.util.*;
public class Problem1{
    public static String rev(StringBuilder str){
      str.reverse();
      return String.valueOf(str);

    }
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
     System.out.print("enter the string : ");
     String s=sc.next();
    StringBuilder str=new StringBuilder(s);
    System.out.println("reversed string is : "+ rev(str));
   


}
}