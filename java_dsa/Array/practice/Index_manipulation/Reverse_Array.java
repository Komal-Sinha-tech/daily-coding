package practice.Index_manipulation;
import java.util.*;
//two pointer approach
public class Reverse_Array {
    public static void Reverse_Array(int numbers[]){
        int start=0;
        int end=numbers.length-1;
        int temp;
        while(start<end){
             temp = numbers[start];
            numbers[start] = numbers[end];
             numbers[end]=temp;
         start++;
         end--;
        }
        System.out.print(Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8,9,10};
        Reverse_Array(numbers);
    }
}
