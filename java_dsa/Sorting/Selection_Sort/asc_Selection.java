package Sorting.Selection_Sort;

public class asc_Selection {
    public static void asc_Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void print_Array(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,7,9,1,6,5,8};
           asc_Selection(arr);
           print_Array(arr);
    }
}
