package Sorting.Bubble_Sort;

import java.util.Arrays;

public class already_sorted {
    public static void already_sorted(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                 if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap == 0){
                    System.out.println("the array was already sorted");
                }break;
        }
        
    }
    public static void main(String[] args) {
        int arr []={2,3,6,8};
        already_sorted(arr);
        System.out.println(Arrays.toString(arr));
    }
}
