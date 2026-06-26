package practice.Index_manipulation;
import java.util.*;
public class brute_rightrotate {
    public static void brute_rightrotate(int nums[],int d){
        int n = nums.length;
        d=d%n;
        for(int j=0;j<d;j++){
            int temp = nums[n-1];
            for(int i=n-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
        }

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int d=3;
         brute_rightrotate(nums, d);
         System.out.println(Arrays.toString(nums));
    }
}
