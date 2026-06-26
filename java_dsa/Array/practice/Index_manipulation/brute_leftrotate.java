package practice.Index_manipulation;
import java.util.*;
public class brute_leftrotate {
    public static void brute_leftrotate(int nums[],int d){
    int n= nums.length;
    d=d%n; //handles d>n
    for(int j=0;j<d;j++){
        int temp = nums[0];
        for(int i=0;i<n-1;i++){
            nums[i]=nums[i+1];
        }
        nums[n-1]=temp;
    }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int d=2;
        brute_leftrotate(nums, d);
        System.out.println(Arrays.toString(nums));
    }
}
