import java.util.Scanner;

public class checkFever {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("please enter the degree number in your thermometer to check fever ");
        float fever = sc.nextFloat();
        if(fever>100){
            System.out.println("you have a fever");
        }else{
            System.out.println("You don't have a fever");
        }
    }
}
