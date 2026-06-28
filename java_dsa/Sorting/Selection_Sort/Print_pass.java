import java.util.Arrays;



public class Print_pass {
    public static void Print_pass(int arr[]){
        int swaps=0;
        int comparison=0;
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                comparison++;
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
            swaps++;
            System.out.println("after pass: "+(i+1)+"array"+Arrays.toString(arr));
        }
        System.out.println("number of swaps"+swaps);
        System.out.println("number of comparisons"+comparison);
    }

    public static void print_Array(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,7,9,1,6,5,8};
          Print_pass(arr);
           print_Array(arr);
    }
}
