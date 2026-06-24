package practice.max_subArrays;

public class Neg_kadanes {
    public static void Neg_kadanes(int nums[]){
        int maxsum =nums[0];
        int currSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
        }
        maxsum=Math.max(maxsum,currSum);
        System.out.println(maxsum);

    }
    public static void main(String[] args) {
        int nums[]={-2,-4,-6,-8,-3,-9};
        Neg_kadanes(nums);
    }
}
