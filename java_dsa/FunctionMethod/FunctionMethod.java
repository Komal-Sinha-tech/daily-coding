import java.util.*;

// public class FunctionMethod{
//     public static void printHelloWorld() {
//         System.out.println("Hello World");
//         return;
//     }
//     public static int sumOfNum(int a, int b){ // parameter or acformal parameter
//          int sum = a+b;
//          return sum;
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//          int a = sc.nextInt();
//          int b = sc.nextInt();
//     int sum = sumOfNum(a,b); // arguments or actual parameters
//     System.out.println("the sum is:" +sum);
// }
//
public class FunctionMethod {
    // public static int multiply(int a, int b){
    //     int multiply = a*b;
    //     return multiply;
    // }

    public static int factorial(int n) {
        int f= 1;
        for(int i=1;i<=n;i++){
        f= f*i;
        }
        return f ;
    }
    public static int binCoeff (int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
         
        int binCoeff = fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }

    public static boolean isPrime (int n){
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                isPrime=false;
                break;
            }
        }
    return isPrime;
    }

    public static void primeRange (int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){ //true
                System.out.print(i+" ");
            }
        }
        System.out.println();
      
    }

    public static void binToDec (int binNum){
       int  pow=0;
       int decimal =0;
       int original =binNum;
       while(binNum>0){
        int LastDigit = binNum % 10; //for last digit
        decimal= decimal+(LastDigit*(int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10; // removes the last digit
       }
       System.out.println("decimal of "+original+" = "+decimal);
    }

    public static void decToBin (int n){
        int binNum =0;
        int pow = 0;
        int original =n;
        while(n>0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
           n= n/2;
        }
          System.out.println("binary of: "+original+ "= "+binNum);

    }

public static void main (String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int multiply=multiply(a,b);
// System.out.println("the multiplication is:"+multiply);


// System.out.println(factorial(5));
// System.out.println(binCoeff(5,2));
//  System.out.println(isPrime(5));
// primeRange(20);
// binToDec(1010);
decToBin(8);
 }
    
}
