package Basics;

import java.util.Arrays;

public class move_zeroEnd {
    public static void move_zeroEnd(int nums[]){
        //created a temp array and array size should be till nums.length
        int temp[]=new int[nums.length];
        int j=0;
        //checked non-zero elements and copied them in temp array
        for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            temp[j]=nums[i];
            j++;
        }
        }
        //fill the zero elements till nums.length
        while(j<nums.length){
            temp[j]=0;
            j++;
        }
        //copying the temp arr in original nums arr
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
      System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int nums[]={1,0,2,0,3,0,5,0,7,0,8};
        move_zeroEnd(nums);
        
    }
}
