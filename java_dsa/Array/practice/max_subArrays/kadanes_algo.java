package practice.max_subArrays;

public class kadanes_algo {
    public static void kadanes_algo(int nums[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        System.out.println("the max sum using kadens algorithm is:"+maxSum);
        
    }
    public static void main(String[] args) {
         int nums[]={2,4,6,8,-3,9};
         kadanes_algo(nums);
    }
}
