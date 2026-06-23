package practice.Index_manipulation;

public class sec_smallest {
    public static void sec_smallest(int numbers[]){
        int smallest = numbers[0];
        int sec_smallest = Integer.MAX_VALUE;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<smallest){
                sec_smallest=smallest;
                smallest=numbers[i];
            }else if(numbers[i]>smallest && numbers[i]<sec_smallest){
                sec_smallest=numbers[i];
            }
        }
        System.out.println(sec_smallest);
    }
    public static void main(String[] args) {
         int numbers[]= {2,4,6,7,1,7,9};
         sec_smallest(numbers);
    }
}
