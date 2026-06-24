package practice.Nested_loops;

public class Print_subArrays {
    public static void Print_subArrays(int numbers[]){
        int n= numbers.length;
    for(int i=0;i<n;i++){
         int start=i;
        for(int j=i;j<n;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
         int numbers[]= {2,4,6,8};
         Print_subArrays(numbers);
    }
}
