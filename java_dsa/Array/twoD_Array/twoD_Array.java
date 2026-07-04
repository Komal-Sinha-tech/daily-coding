package twoD_Array;
import java.util.*;
public class twoD_Array{
    public static boolean search(int matrices[][],int key){
       for(int i=0;i<matrices.length;i++){
          for(int j=0;j<matrices[0].length;j++){
           if( matrices[i][j]== key){
            System.out.println("matrix found at cell (" +i+","+j+")");
               return true;
           }
          }
         }
         return false;
    }

    public static void main(String[] args) {
         int matrices [][]= new int [3][3];
         int n= matrices.length;
         int m= matrices[0].length;
         int key=5;
         //input
         System.out.println("Enter 9 numbers:");
         Scanner sc = new Scanner (System.in);
         for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            matrices[i][j]= sc.nextInt();
          }
         }
        
         //output
         for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            System.out.print(matrices[i][j]+" ");
          }
          System.out.println();
         }
         
        search(matrices, key);
    }
}