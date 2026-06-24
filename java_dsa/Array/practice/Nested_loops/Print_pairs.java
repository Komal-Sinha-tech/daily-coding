package practice.Nested_loops;

public class Print_pairs {
    public static void Print_pairs(int numbers[]){
        int totalPairs =0;
     for(int i=0;i<numbers.length;i++){
        int curr = numbers[i];
        for(int j=i+1;j<numbers.length-1;j++){
            System.out.print("("+curr+","+numbers[j]+")");
            totalPairs++;
        }
        System.out.println();
     }
     System.out.println("total pairs is : "+totalPairs);
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,4,6,7,7,9};
        Print_pairs(numbers);
    }
}
