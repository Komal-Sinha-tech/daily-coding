import java. util.*;
public class arraynew {

    public static int LinearSearch (int numbers[],int key){
for(int i=0;i<numbers.length;i++){
    if(numbers[i]== key){
        return i;
    }

}
return -1;
    }


    public static int Largest(int numbers []){
         int largest = Integer.MIN_VALUE;
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest =numbers[i]; 
            }
         }
         return largest;
    }
    public static int Smallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
            for(int i =0;i<numbers.length;i++){
              if(numbers[i]< smallest){
                smallest = numbers[i];
              }
            }
        return smallest;
    }

    public static  int BinarySearch(int numbers[],int key){
        int start =0;
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            //comparisons
            if(numbers[mid] == key){
                return mid;
            }if (numbers[mid] < key){ //right
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void Reverse_Array(int numbers[]){
        int start = 0;
        int last = numbers.length-1;

        while(start < last){
            int temp = numbers[last];
            numbers[last]= numbers[start];
            numbers[start]= temp;

            start++;
            last--;

        }
    }

    public static void Pairs_array(int numbers[]){
        int tp=0;
        for(int i =0;i<numbers.length;i++){
            int curr = numbers[i]; //2,4,6,8,10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+tp);
    }

    public static void SubArrays (int numbers[]){
        int ts=0;
        for (int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){ //print
                 System.out.print(numbers[k]+" "); //subarray
                 ts++;
                }
                 System.out.println();
            }
             System.out.println();
        }
        System.out.println("total subarrays" +ts);
    }

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

    public static void PrefixSubArrays (int numbers[]){
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        int prefix[]=  new int [numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+ numbers[i];
        }
        for (int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                 currSum=start == 0? prefix[end]:prefix[end]-prefix[start - 1];
                
                if(maxSum < currSum){
                    maxSum = currSum;              
                }
            }
        }
        System.out.println("max sum :" +maxSum);
    }

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
        System.out.println("max subarray sum is  :" +maxSum);
    }

    public static int TrappedWater (int height[]){
        int n=height.length;
        //calculate left max boundary - array form
       int  leftMax []= new int [n];
       leftMax[0]= height[0];
       for(int i=1;i<n;i++){
        leftMax[i] = Math.max(height[i],leftMax[i-1]);
       }
        //calculate right max boundary
        int rightMax[] = new int [n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int TrappedWater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel = min(leftmax array,rightmax array)
           int waterLevel = Math.min(leftMax[i],rightMax[i]);
           //trapped water = waterlevel - height [i]
           TrappedWater+=waterLevel - height[i];
        }
        return TrappedWater;
    }
    public static int Buy_Sell_Stocks(int prices[]){
        int n= prices.length;
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit =0;

        //loop
        for(int i=0;i<n;i++){
         if(buyPrice < prices[i]){ //profit
            int profit = prices[i]- buyPrice; //today's profit
            maxProfit = Math.max(maxProfit,profit);
         }else{
            buyPrice = prices[i];
         }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        //linear search

        // int numbers[]={2,4,6,8,10,12,14,16,18,20};
        // int key = 55;
        // int index =LinearSearch(numbers,key);
        // if(index == -1){
        //     System.out.println("Element not found in the array");
        // }else{
        //     System.out.println("Element found at index: "+index);
        // }

        //largest array

        // int numbers []= {1,2,3,4,6,5};
        // System.out.println("The largest element is: " +Largest(numbers));
        // System.out.println("The smallest element is: " +Smallest(numbers));
    
       //binary search 
        // int numbers[]={2,4,6,8,10,12,14,16,18,20};
        // int key = 20;
        // System.out.println("Index of element: " +BinarySearch(numbers,key));

        //reverse array
        // int numbers[]= {2,4,6,8,10};
        //  Reverse_Array(numbers);
        // for(int i=0;i< numbers.length;i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println("");
        

        //pairs in array
        // int numbers[]= {2,4,6,8,10};
        // Pairs_array(numbers);

        //subarrays
        //  int numbers[]= {2,4,6,8,10};
        //  SubArrays(numbers);

        //Maxsub arrays
        // int numbers[]= {1,-2,6,-1,3};
        // MaxSubArrays(numbers);

        //Prefix array
        // int numbers[]= {1,2,6,1,3};
        // PrefixSubArrays (numbers);

        //kaden algorithm
        // int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
        // Kaden(numbers);

        //Trapped Water
        // int height[] = {4,2,0,6,3,2,5};
        // System.out.println(TrappedWater(height));

        //Buy & Sell Stock
        // int prices[]={7,1,5,3,6,4};
        // System.out.println(Buy_Sell_Stocks(prices));




    }
}
