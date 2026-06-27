package Sorting.Bubble_Sort;

import java.util.Arrays;

public class asc_Bubble {
    public static void asc_Bubble_sort(int arr[]){
        //outer loop for turns
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
        int arr []= {5, 3, 8, 4, 2};
        asc_Bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
