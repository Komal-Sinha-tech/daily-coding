package practice.Index_manipulation;

import java.util.Arrays;

public class Rotate_Array {
    public static void Rotate_Array(int numbers[]){
        int temp = numbers[0];
        for(int i=0;i<numbers.length-1;i++){
        numbers[i]=numbers[i+1];
        }
        numbers[numbers.length-1]=temp;

        System.out.print("the rotated array is:" +Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        Rotate_Array(numbers);
    }
}
