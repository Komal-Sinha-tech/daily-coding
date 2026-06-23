package practice.Index_manipulation;

import java.util.Arrays;

public class Swap_first_last {
    public static void Swap_first_last(int numbers[]){
        int start=0;
        int end=numbers.length-1;
        int temp = numbers[start];
          numbers[start]=numbers[end];
          numbers[end]=temp;
        System.out.println("Swap array is :" +Arrays.toString(numbers));
      }
    public static void main(String[] args) {
         int numbers[]= {1,2,3,4,5,6,7,8,9,10};
         Swap_first_last(numbers);
    }
}
