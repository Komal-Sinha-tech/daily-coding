import java.util.Scanner;

public class SignIdentify {
    public static void main(String[] args) {

      Scanner sc = new Scanner (System.in);
      System.out.println("please enter the number with a sign");
     double num = sc.nextDouble();  

     if(num>=0){
        System.out.println("the no is positive");
     }else{
        System.out.println("the no. is negative");
     }


    }
    
}
