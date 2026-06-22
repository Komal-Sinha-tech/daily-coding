package practice.Traversal_Logic;
//Print all elements of an array
public class print_array {
    public static void Print_array(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(" " +nums[i]);
        }
    }
    public static void main(String args[]){
        int nums []= {2,4,6,8,10};
      Print_array(nums);
        
    }
}
