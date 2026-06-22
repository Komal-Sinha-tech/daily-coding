package Basics;

public class Reverse_Array {
    public static void Reverse_Array(int numbers[]){
        int start = 0;
        int last = numbers.length-1;

        while(start < last){
            int temp = numbers[last];
            numbers[last]= numbers[start];
            numbers[start]= temp;

            start++;
            last--;

        }
    }

    public static void main(String[] args) {

    
    
        //reverse array
        int numbers[]= {2,4,6,8,10};
         Reverse_Array(numbers);
        for(int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("");
    }
    
}
