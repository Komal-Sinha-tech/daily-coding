package practice.Traversal_Logic;

public class Smallest_Element {
    public static void Smallest_Element(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest= numbers[i];
            }
        }
        System.out.println("the smallest element is: " +smallest);
    }
    public static void main(String[] args) {
       int numbers [] = {4,6,2,7,8,9};
       Smallest_Element(numbers);
    }
}
