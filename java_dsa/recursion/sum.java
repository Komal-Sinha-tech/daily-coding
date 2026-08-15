package recursion;

public class sum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sumN_1 = sum(n-1);
        int sumN = n+ sum(n-1);
        return sumN;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println(sum(n));
    }
}
