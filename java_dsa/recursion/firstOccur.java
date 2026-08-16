package recursion;

public class firstOccur {
    public static int firstOccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
    return firstOccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,8,9,4};
        System.out.println(firstOccur(arr, 7, 0));
    }
}
