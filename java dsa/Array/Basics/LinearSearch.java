package Basics;
import java.util.*;
public class LinearSearch {

    public static int LinearSearch (int numbers[],int key){
for(int i=0;i<numbers.length;i++){
    if(numbers[i]== key){
        return i;
    }

}
return -1;
    }

    //linear search
      public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key = 18;
        int index =LinearSearch(numbers,key);
        if(index == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index: "+index);
        }
    }
    
}

