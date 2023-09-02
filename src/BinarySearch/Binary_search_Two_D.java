package BinarySearch;

import java.util.Arrays;

public class Binary_search_Two_D {
    public static int[] BinarySeach2D(int arr1[][],int target){
        int r=0;

        int c=arr1[0].length-1;
        while(r<arr1.length && c>=0){
            if(arr1[r][c]==target){
                return new int[]{r,c};
            }
            if(arr1[r][c]<target){
                r++;
            }
            else{
                c++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int target=3;
        System.out.println(Arrays.toString(BinarySeach2D(arr1,target)));
    }
}
