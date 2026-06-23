package practice.Index_manipulation;

public class If_Sorted_arr {
    public static boolean If_Sorted_arr(int numbers[]){
       for(int i=0;i<numbers.length-1;i++){
        if(numbers[i]>numbers[i+1]){
            return false;
        }
       }
      return true;
    }
    public static void main(String[] args) {
        int numbers[]={2,6,8,9};
       boolean result= If_Sorted_arr(numbers);
       if(result == true){
       System.out.println("the array is sorted");
       }else{
        System.out.println("the array is not sorted");
       }
    }
}
