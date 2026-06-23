package practice.Traversal_Logic;
import java.util.*;

public class sumEvenOdd {
    public static void Even_odd_count(int numbers[]){
        int even = 0;
        int odd = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] % 2 == 0){
                even ++;
            }else{
                odd ++;
            }
        }
         System.out.println("Even number :" +even);
         System.out.println("Odd number : "+odd);
    }
    public static void main(String[] args) {
        int numbers []= {1,2,3,4,5,6,7,8,9,10};
        Even_odd_count(numbers);
    }
}
