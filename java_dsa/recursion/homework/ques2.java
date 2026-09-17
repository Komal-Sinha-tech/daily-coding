package recursion.homework;
// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.
public class ques2 {
    static String [] words ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void PrintString (int n){
        if(n == 0){
            return;
        }
        PrintString(n / 10);
        int digit = n % 10;
        System.out.print(words[digit]+" ");
    }
    public static void main(String[] args) {
        int n=1978;
       PrintString(n);
    }
}
