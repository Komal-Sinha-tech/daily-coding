package practice.Nested_loops;

public class sums_subArrays {
    public static void sums_subArrays(int nums[]){
        int sum=0;
        int ts=0;
    for(int i=0;i<nums.length;i++){
        int start=i;
        for(int j=i;j<nums.length;j++){
            int end=j;
            ts++;
            sum=0;
            for(int k=start;k<=end;k++){
                System.out.print(nums[k]+" ");
                sum+=nums[k];
            }
            System.out.println(" Sum = " + sum);
        }
        System.out.println();
    }
    System.out.println("total sub arrays: "+ts);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8};
        sums_subArrays(nums);
    }
    
}
