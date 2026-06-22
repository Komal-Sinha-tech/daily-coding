package Basics;
import java. util.*;
public class SmallestNum {

    public static int SmallestNum(int numbers[]){
        int smallest = Integer.MAX_VALUE;
            for(int i =0;i<numbers.length;i++){
              if(numbers[i]< smallest){
                smallest = numbers[i];
              }
            }
        return smallest;
    }

   public static void main(String[] args) {
          //Smallest array

        int numbers []= {1,2,3,4,6,5};
        System.out.println("The smallest element is: " +SmallestNum(numbers));
    }
}
