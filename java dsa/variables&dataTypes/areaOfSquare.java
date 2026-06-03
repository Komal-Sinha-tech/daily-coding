
import java.util.Scanner;
public class areaOfSquare {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
      //Step 1 take the input of side of a square from user
      System.out.println("enter the no for side of a square:");
      double A = sc.nextDouble();

      //step 2 find area of the square
      double area = (A*A);
      System.out.println("the area of a square is:"+area);
    }
}
