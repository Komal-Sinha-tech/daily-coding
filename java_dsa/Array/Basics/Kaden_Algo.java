package Basics;

public class Kaden_Algo {
    public static void Kaden (int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<numbers.length;i++){
            currSum += numbers[i];
            if(currSum <0){
                currSum =0;
            }
            maxSum= Math.max(currSum,maxSum);
        }
        System.out.println("max subarray sum is  : " +maxSum);
    }
    public static void main(String[] args) {
    
        //kaden algorithm
        int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
        Kaden(numbers);
    }
}
