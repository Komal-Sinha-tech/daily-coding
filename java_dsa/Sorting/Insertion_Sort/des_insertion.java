package Sorting.Insertion_Sort;

public class des_insertion {
    public static void des_insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void print_Array(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,1,6,5,8};
        des_insertion(arr);
        print_Array(arr);
    }
}
