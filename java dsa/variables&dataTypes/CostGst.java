import java.util.Scanner;
public class CostGst {


    public static void main (String []args){
    Scanner sc = new Scanner(System.in);

    // step 1 cost of 3 items from the user pencil,pen and eraser
    System.out.println("the cost of pencil is: ");
   float pencil = sc.nextFloat();

    System.out.println("the cost of pen is: ");
    float pen = sc.nextFloat();

    System.out.println("the cost of eraser is: ");
    float eraser = sc.nextFloat();
    
    // step 2 total cost
     float totalCost = (pencil+pen+eraser);
     System.out.println("the total cost of 3 items is : "+totalCost);

     //step 3 gst tax
     float GstTax = (totalCost*18)/100;
     System.out.println("the gst tax on 3 items is: "+GstTax);
    }
}
