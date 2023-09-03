package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,8,5,9,3,1,6,0};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1 ;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        for(int a:arr)
            System.out.print(a+" ");
    }
}
