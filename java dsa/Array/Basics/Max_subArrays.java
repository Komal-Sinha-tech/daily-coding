package Basics;

public class Max_subArrays {
    public static void MaxSubArrays (int numbers[]){
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        for (int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                 currSum=0;
                for(int k=start;k<=end;k++){ //print
                 currSum += numbers[k];  //subarray sum
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;              
                }
            }
        }
        System.out.println("max sum :" +maxSum);
    }
     public static void main(String[] args) {
        //Maxsub arrays
        int numbers[]= {1,-2,6,-1,3};
        MaxSubArrays(numbers);
     }
}
