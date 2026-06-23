package practice.Traversal_Logic;

public class Average_Element {
    public static void Average_Element(int numbers[]){
        int CalSum=0;
        int CalAvg = 0;
    for(int i=0;i<numbers.length;i++){
         CalSum += numbers[i];
         CalAvg = CalSum/numbers.length;
    }
    System.out.println(CalAvg);
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8};
        Average_Element(numbers);
    }
}
