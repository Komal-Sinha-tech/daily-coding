package recursion;

public class powerOpt {
    public static int optimized_Power(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPowerSqr = optimized_Power(a, n/2)*optimized_Power(a, n/2);
        if(n % 2 !=0){
            halfPowerSqr=a*halfPowerSqr;
        }
        return halfPowerSqr;
    }
    public static void main(String[] args) {
        System.out.println(optimized_Power(2, 9));
    }
}
