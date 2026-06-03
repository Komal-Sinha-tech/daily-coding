import java.util.Scanner;


public class functionpr {

    //q1) write a java method to compute the avg of three numbers
public static int AvgOfNum (int a,int b,int c) {
int sum = (a+b+c)/3;
return sum;
}


//write a method named isEven that accepts an int argument the metho0d should return true if the argument is even,or false otherwise also write a program to test your method.
public static boolean isEven (int n){
    if(n%2 ==0){
        return true;
    }else{
        return false;
    }
}
//write a java program to check if a no is palindrome or not?
public static boolean isPalindrome (int Num){
    int palindrome = Num;
    int reverse =0;
    while(palindrome!=0){
    int remainder = palindrome %10;
    reverse = reverse*10+remainder;
    palindrome=palindrome/10;
    }
    if(Num == reverse){
        return true;
    }else{
        return false;
    }
    
}

//write a java method to compute the sum of the digits in an integer 
public static int sumOfInt (int num){
    int sum = 0;
    while(num>0){
       int lastDigit = num%10; 
       sum+=lastDigit;
       num = num/10;
    }
 return sum;
}


    public static void main(String[] args) {
        
        //q1) write a java method to compute the avg of three numbers
    //    int avg = AvgOfNum(45,50,60);
    //    System.out.println("Avg of three numbers:"+avg);

      
    // boolean isEven =isEven(14);
    // System.out.println( "the integer is"+isEven);

    // System.out.println("enter the integer :");
    // Scanner sc = new Scanner (System.in);
    // int palindrome = sc.nextInt();
    // if(isPalindrome(palindrome)){
    //     System.out.println("Number :"+palindrome+ " is palindrome");
    // }else{
    //     System.out.println("Number :"+palindrome+ " not palindrome");
    // }


    System.out.println("enter the integer :");
    Scanner sc = new Scanner (System.in);
    int sumNum = sc.nextInt();
    System.out.println("the sum is "+sumOfInt(sumNum));
    
    
    


    


    }
}
