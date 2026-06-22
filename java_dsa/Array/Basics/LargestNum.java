package Basics;
import java. util.*;

public class LargestNum {
    public static int Largest(int numbers []){
         int largest = Integer.MIN_VALUE;
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest =numbers[i]; 
            }
         }
         return largest;
    }

    public static void main(String[] args) {
          //largest array

        int numbers []= {1,2,3,4,6,5};
        System.out.println("The largest element is: " +Largest(numbers));
        
    }
}
