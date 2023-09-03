package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,8,5,9,3,1,6,0};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
       for(int j=1;j< arr.length;j++){
           int key=arr[j];
           int i=j-1;
           while(i>=0 && arr[i]>key){
               arr[i+1]=arr[i];
               i--;
           }
           arr[i+1]=key;
       }
        for(int a:arr)
            System.out.print(a+" ");
    }
}
