package practice.max_subArrays;

public class brute_force_max_sum {
    public static void brute_force_max_sum(int nums[]){
        int maxSum =Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum +=nums[k];
                    System.out.print(nums[k]+" ");
                }
                System.out.println("="+currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("The max subarray is: "+maxSum);
    }

    public static void main(String[] args) {
        int nums[]={2,4,6,8};
        brute_force_max_sum(nums);
    }
}
