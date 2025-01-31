public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(arr[i]>arr[j]){
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[i]^arr[j];
                arr[i]=arr[i]^arr[j];
              }
            }
        }


    }
    public static void main(String[] args) {
        int marks[]={98,75,67,101,91,99,80,54};
        System.out.println("intial array is :");
        for(int it:marks){
          System.out.print(it+" ");
        }
        System.out.println();
        selectionSort(marks);
        System.out.println("after sorting array is: ");
        for(int it:marks){
            System.out.print(it+" ");
          }
    }
}
