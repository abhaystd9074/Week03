package linearSearch;

public class Problem2 {

    public static void main(String[] args) {
        String arr[]={"Abhay ia a 21 years old Boy","He loves learning new things","He also loves Problem-Solving"};
        System.out.println("target word is : "+ "Problem-Solving");
        String ans=null;
        for(String it:arr){
           if(it.contains("Problem-Solving")){
            ans=it;
           }
        }

        if(!ans.equals(null)) System.out.println("sentence with target word is : " +ans);
        else System.out.println("sentence is not present");
    }
    
}
