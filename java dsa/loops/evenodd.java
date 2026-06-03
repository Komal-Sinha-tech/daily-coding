import java.util.Scanner;

public class evenodd {
    public static void main (String []args){
    
        Scanner sc = new Scanner (System.in);
        int even =0;
        int odd = 0;
        System.out.println("Enter the number of integers:");
         int num = sc.nextInt();

          System.out.println("Enter"+ num +"integers:");

          for(int i=0;i<num;i++){
            int number = sc.nextInt();
            if( number%2 == 0){
              even+= number;
            }else{
                odd+=number;
            }
          }

          System.out.println("sum of even numbers"+even);
          System.out.println("sum of odd numbers"+odd);

          

    }
}