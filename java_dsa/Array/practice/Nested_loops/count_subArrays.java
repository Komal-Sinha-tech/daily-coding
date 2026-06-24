package practice.Nested_loops;

public class count_subArrays {
    public static void count_subArrays(int nums[]){
        int total_SubArrays =0;
        for(int i=0;i<nums.length;i++){
        int start =i;
        for(int j=i;j<nums.length;j++){
            int end=j;
             total_SubArrays++;
            for(int k=start;k<=end;k++){
                System.out.print(nums[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
        }
        System.out.println("total count_subArrays :"+total_SubArrays);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8};
        count_subArrays(nums);
    }
}
