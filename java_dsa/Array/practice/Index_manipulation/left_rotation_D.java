package practice.Index_manipulation;
import java.util.Arrays;


public class left_rotation_D {
    public static void reverse_Array(int arr[],int start,int end){
        while(start<end){
           int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
    }  
    public static void left_rotate(int arr[],int d){
        int n= arr.length;
         d = d % n;
        reverse_Array(arr,0,d-1);
        reverse_Array(arr,d,n-1);
        reverse_Array(arr,0, n-1);
    
    }
      public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
     left_rotate(arr, d);
    System.out.println(Arrays.toString(arr));
   
    }
}
