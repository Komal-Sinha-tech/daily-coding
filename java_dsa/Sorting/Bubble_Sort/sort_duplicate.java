package Sorting.Bubble_Sort;

import java.util.Arrays;

public class sort_duplicate {
    public static void sort_duplicate(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                 if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,6,4,5,4,3};
        sort_duplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
}