import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
    
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        System.out.println("enter non negative integer");
        if(num<0){
            System.out.println("not valid");
        }else{
            int factorial=1;
            for(int i=1;i<=num;i++){
                factorial *=i;
            }
        }
        System.out.println("Factorial of" +num+ "is" +factorial);
    }
}
