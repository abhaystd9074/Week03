package stringBuilderProblems;
import java.util.HashSet;
import java.util.*;
public class Problem2{
    public static String removeDuplicate(StringBuilder str){
        StringBuilder ans=new StringBuilder();
      HashSet<Character> s=new HashSet<>();
      for(int i=0;i<str.length();i++){
       if(!s.contains(str.charAt(i))){
          ans.append(str.charAt(i));
       }
       s.add(str.charAt(i));
      }
      return String.valueOf(ans);

    }
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
     System.out.print("enter the string : ");
     String s=sc.next();
    StringBuilder str=new StringBuilder(s);
    System.out.println("reversed string is : "+ removeDuplicate(str));
   


}
}