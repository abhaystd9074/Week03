public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] >arr[j+1]){
                    arr[j]=arr[j+1]^arr[j];
                    arr[j+1]=arr[j+1]^arr[j];
                    arr[j]=arr[j]^arr[j+1];
                    flag=true;
                }

            }
            if(!flag) break;
        }


    }
    public static void main(String[] args) {
        int marks[]={98,75,67,101,91,99,80,54};
        System.out.println("intial array is :");
        for(int it:marks){
          System.out.print(it+" ");
        }
        System.out.println();
        bubbleSort(marks);
        System.out.println("after sorting array is: ");
        for(int it:marks){
            System.out.print(it+" ");
          }
    }
    
}
