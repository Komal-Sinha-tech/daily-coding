package Basics;

public class SubArrays {
    public static void SubArrays (int numbers[]){
        //total subarrays
        int ts=0;
        for (int i=0;i<numbers.length;i++){
           // for line break and starting point
            int start =i;
            for(int j=i;j<numbers.length;j++){
                //ending point 
                int end =j;
                ts++;
                for(int k=start;k<=end;k++){ //print
                 System.out.print(numbers[k]+" "); //subarray
                }
                 System.out.println();
            }
             System.out.println();
        }
        System.out.println("total subarrays" +ts);
    }

    public static void main(String[] args) {

        //subarrays
         int numbers[]= {2,4,6,8};
         SubArrays(numbers);
    }
    
}
