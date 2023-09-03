package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,8,5,9,3,1,6,0};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a:arr)
            System.out.print(a+" ");
    }

}
