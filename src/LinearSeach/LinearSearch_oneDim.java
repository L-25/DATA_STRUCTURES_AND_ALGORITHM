package LinearSeach;

public class LinearSearch_oneDim {
    public static int LinearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=3;
        System.out.println(LinearSearch(arr,target));
    }
}
