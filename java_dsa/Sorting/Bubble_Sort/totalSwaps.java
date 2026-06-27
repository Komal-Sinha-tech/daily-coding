package Sorting.Bubble_Sort;

import java.util.Arrays;

public class totalSwaps {
     public static void totalSwaps(int arr[]){
        //outer loop for turns
         int totalSwaps=0;
         int comparisons=0;
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                 comparisons++; //count every comparison
                if(arr[j]>arr[j+1]){ 
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    totalSwaps++; //total swap
                }
            }
        }
        System.out.println("Total comparison "+comparisons);
        System.out.println("Total Swaps : "+totalSwaps);
    }
    public static void main(String[] args) {
        int arr []= {5, 3, 8, 4, 2};
        totalSwaps(arr);
        System.out.println(Arrays.toString(arr));
    }
}
