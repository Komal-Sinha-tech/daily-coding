package practice.Traversal_Logic;
import java.util.*;
public class Sum_ELement {

    public static void Sum_ELement(int numbers[]){
        int currSum =0;
    for(int i=0;i<numbers.length;i++){
        currSum += numbers[i];
        }
        System.out.print(currSum);
    }
    public static void main(String[] args) {
         int numbers [] = {4,6,2,7,8,9};
         Sum_ELement(numbers);
    }
}
