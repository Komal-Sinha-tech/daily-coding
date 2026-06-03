import java.util.Scanner;

public class average{
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    //step 1 : Input three numbers from the user
    System.out.println("enter the firstNumber (A): ");
    double A = sc.nextDouble();

    System.out.println("enter the firstNumber (B): ");
    double B = sc.nextDouble();

    System.out.println("enter the firstNumber (C): ");
    double C = sc.nextDouble();

    //step 2: Calculate the sum 
    double sum = A+B+C;

    //step 3: calculate avg
    double avg = sum/3;

    //step 4 : display the result
    System.out.println("The average number is: "+avg);
    sc.close();
    }
}