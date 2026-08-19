package recursion;
public class power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int x_1 = power(x, n-1);
        int xN = x * x_1;
        return xN;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
