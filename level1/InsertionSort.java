public class InsertionSort {


    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int temp=arr[i];
            
            while(j>=0  && arr[j] > temp ){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=temp;
        }


    }
    public static void main(String[] args) {
        int marks[]={98,75,67,101,91,99,80,54};
        System.out.println("intial array is :");
        for(int it:marks){
          System.out.print(it+" ");
        }
        System.out.println();
        insertionSort(marks);
        System.out.println("after sorting array is: ");
        for(int it:marks){
            System.out.print(it+" ");
          }
    }
    
}
