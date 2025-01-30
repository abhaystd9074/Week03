import java.util.*;
import java.util.HashMap;
public class TargetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.print("enter the size of the aarray: ");
          int n=sc.nextInt();
          System.out.println("enter array elements : ");
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          System.out.print("enter target sum: ");
          int target=sc.nextInt();
          boolean flag=false;
          HashMap<Integer,Integer>mp=new HashMap<>();
          int ans=0;
          int i;
          for( i=0;i<n;i++){
            if(mp.containsKey(target - arr[i])){
                  flag=true;
                  break;
                }
            mp.put(arr[i],i);
          }
          if(flag) System.out.println("pair is present ");
          else System.out.println("pair is not presnt ");

    }
}
