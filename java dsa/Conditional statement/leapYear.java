import java.util.Scanner;

public class leapYear {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    {

        System.out.println("enter the year you want to check if it's leap year or not");
        int year=sc.nextInt();
        if(year%4==0 || year%400==0 ) {
        System.out.println("It's a leap year");
        }else{
            System.out.println("It's not a leap year");
        }
    }
   } 
}
