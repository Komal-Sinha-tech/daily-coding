
public class des_Selection {
    public static void des_Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maxPos =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxPos]){
                    maxPos=j;
                }
            }
            //swap
            int temp=arr[maxPos];
            arr[maxPos]=arr[i];
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
        des_Selection(arr);
        print_Array(arr);
    }
}
