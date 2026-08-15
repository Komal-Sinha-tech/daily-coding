package recursion;

public class fibbonaci {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int fibN_1 = fibonacci(n-1);
        int fibN_2= fibonacci(n-2);
        int fibN= fibonacci(n-1)+fibonacci(n-2);
        return fibN;
    }
    public static void main(String[] args){
        int n=8;
        System.out.println(fibonacci(n));
    }
}
