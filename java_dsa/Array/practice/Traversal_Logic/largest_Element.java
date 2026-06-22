package practice.Traversal_Logic;

public class largest_Element {
    public static void largest_Element(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        System.out.println("the largest element is : " +largest);
    }
    public static void main(String[] args) {
        int numbers []={2,4,6,8,10,12};
         largest_Element(numbers);
    }
}
