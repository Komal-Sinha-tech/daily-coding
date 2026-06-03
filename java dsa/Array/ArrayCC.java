import java.util.*;
public class ArrayCC{

    public static void Update(int marks[]){
    for (int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
    }    }


    public static void main(String[] args) {
    int marks[]= new int[90];
    Update(marks);
    // String fruits[]= {"orange","apple","kiwi"};

    // Scanner sc = new Scanner(System.in);
    // marks[0]=sc.nextInt();
    //  marks[1]=sc.nextInt();
    //   marks[2]=sc.nextInt();

    //   System.out.println("phys: "+marks[0]);
    //    System.out.println("Chem: "+marks[1]);
    //     System.out.println("Math: "+marks[2]);

    //     marks[2]=100;
    //      System.out.println("Math: "+marks[2]);

}
}
