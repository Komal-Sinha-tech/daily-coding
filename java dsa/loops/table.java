import java.util.Scanner;

public class table {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int  num = scanner.nextInt();
    System.out.println("the table of"+num);

    for(int i=1;i<=10;i++){
        int mul = num*i;
        System.out.println(+num+ "x" +i+ "="+mul);

    }
    }
}
